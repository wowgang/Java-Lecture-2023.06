#####################################################
#
# 데이터 조작 언어(DML : Data Manipulation Language)
#
######################################################

/*
 * 1. Select
 */
USE world;		# 사용할 데이터 베이스 선택
SHOW TABLES;	# 현 데이터베이스에 있는 테이블 조회
DESC city;		# city 테이블의 구조 보기
/*
SELECT 필드명
	FROM 테이블명
	JOIN 테이블명
	ON 조인 조건
	GROUP BY 필드명
	ORDER BY 필드명 순서
	LIMIT 숫자 OFFSET 숫자
 */
# 필드명은 대소문자 구분 안해도 실행이되나 data의 대소문자는 꼭 대소문자 구분해서 사용하기
# 필드명과 JAVA의 필드명을 일치시키는게 좋음

SELECT * FROM city;
SELECT `name` , population FROM city LIMIT 10;	# 필드명을 보존하고 싶을 때 `back quote` 사용
# mysql에서 대문자로 바뀌는거는 keyword이다. ex)NAME 

/*
 * 1.1 조회조건: WHERE
 */

SELECT * FROM city WHERE countrycode='KOR';
SELECT `name`, district, population FROM city WHERE countrycode='KOR';
SELECT * FROM city WHERE district='seoul';
SELECT * FROM city WHERE countrycode='KOR' AND population>1000000;

SELECT DISTINCT district FROM city WHERE countrycode='KOR'; 		# 고유한 값 - DISTINCT

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city 
	WHERE district='Seoul' OR district='Inchon' OR district='Kyonggi';
	WHERE district IN ('Seoul', 'Incheon', 'Kyonggi'); 		# In 연산자를 사용해서 쿼리를 줄일수 있음

# 국내 100만 이상 도시중 인구수가 홀수인 도시
SELECT * FROM city 
	WHERE CountryCode='KOR' AND Population > 1000000 AND Population % 2 = 1;
	
# 국내 인구수가 50만이상 ~ 100이하 도시
SELECT * FROM city 
	WHERE CountryCode='KOR' AND 500000 < Population AND  Population <= 1000000
	Population BETWEEN 500000 AND 1000000		# between and 사용하여 표기가능
	

# 충청남북도의 도시
SELECT * FROM city 
	WHERE district='Chungchongbuck' OR district='Chungchongnam';
	WHERE district LIKE 'Chungchong%';		# like % wild card , 이대는 like 연산자 사용. 충청으로 시작하는 % 블라블라
	
/*
 * 1.2 순서(Order)
 */
# 전세계 인구수가 8000만 이상인 도시를 내림차순으로 조회
SELECT * FROM city 
	WHERE population >= 8000000
	ORDER BY population DESC;		# DESC - descending
	
# 국내 100만 이상인 도시를 오름차순으로 조회
SELECT * FROM city 
	WHERE countrycode='kor' and population >= 1000000
	ORDER BY population;		# ASC - ascending 생략 기본값임


# 국내 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순으로 조회
SELECT * FROM city 
	WHERE countrycode='kor' and population >= 500000
	ORDER BY district ASC , population DESC;		# ASC 생략가능
	
/*
 * 1.3 갯수 (조회할 때 몇개를 조회할 것 이냐)
 */
# 전세계 인구수 Top 10 도시
SELECT * FROM city 
	ORDER BY population DESC 
	LIMIT 10;
	
# 국내 인구수 Top 5 도시
SELECT * FROM city 
	WHERE countrycode='kor'
	ORDER BY population DESC 
	LIMIT 10;
	
# 국내 인구수 Top 11 ~ 20 도시
SELECT * FROM city 
	WHERE countrycode='kor'
	ORDER BY population DESC 
	LIMIT 10 OFFSET 10;		# offset 앞에서 10개를 건너뛰고, limit 10개를 보여줌 

/*
 * 1.4 함수
 */
# 현재 날짜와 시각
# java: LocalDate.now(); => 2023-07-03T14:54:24.234567	 
SELECT NOW();		# 2023-07-03 14:54:24

# 국내 도시의 갯수 - 레코드의 갯수와 같은 의미
SELECT COUNT(*) FROM city WHERE countrycode='KOR';		# 70

# 국내 도시중 인구수 최대와 최소 도시
SELECT MAX(population), MIN(population) FROM city 
	WHERE countrycode='KOR';
	
# 국내 도시의 인구수 평균
SELECT ROUND(AVG(population)) FROM city 
	WHERE countrycode='KOR';
	
# Aliasing 별칭
SELECT ROUND(AVG(population)) AS avgPopulation FROM city 
	WHERE countrycode='KOR';

/*
 * 1.5 그룹핑(Grouping)
 * 그룹핑할 수 있는 카테고리를 선택해야함 (다다른값을 갖고 있는 것은 안됨)
 */

# 국내 광역시도별 도시의 갯수
SELECT district, COUNT(*) FROM city 
	WHERE countrycode='kor'
	GROUP BY district;
## 아래와 같이 적
SELECT district, COUNT(*) FROM city 
	WHERE countrycode='kor'
	GROUP BY district
	ORDER BY COUNT(*) DESC;
	
# 도시의 갯수가 많으 나라 Top 10
SELECT countrycode, COUNT(*) FROM city 
	GROUP BY countrycode
	ORDER BY COUNT(*) DESC
	LIMIT 10;
	
# 도시의 평균 인구가 높은 나라 Top 10
SELECT countrycode, Round(AVG(population)) FROM city 
	GROUP BY countrycode 
	ORDER BY AVG(population) DESC
	LIMIT 10;
	
# 경기도의 도시 이름
SELECT GROUP_CONCAT(`Name`) FROM city
	WHERE district='kyonggi';	# Songnam,Puchon,Suwon,Anyang,Koyang,Ansan,Kwangmyong, ...

# 국내 광역시도 이름
SELECT GROUP_CONCAT(district) FROM city
	WHERE countrycode='KOR';	# Seoul,Pusan,Inchon,Taegu,Taejon,Kwangju,Kyongsangnam, ...
	
/*
 * 1.5 그룹 조건
 */
# 국내 도시의 갯수가 5개 이상인 도의 평균 인구수
SELECT district, AVG(population) FROM city
	WHERE countrycode='KOR'
	GROUP BY district
	HAVING COUNT(*) >= 5;
	LIMIT 5;	# Top 5

# 국내 도시의 갯수가 5개 이상인 도의 평균 인구수  # Top 5
SELECT district, AVG(population) FROM city
	WHERE countrycode='KOR'
	GROUP BY district
	HAVING AVG(population) >= 5;
	LIMIT 5;	# Top 5
	
# 도시의 갯수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT countrycode, ROUND(AVG(population)) AS avgPop, COUNT(*)AS numCity FROM city
	GROUP BY countrycode
	HAVING COUNT(*) >= 100
	ORDER BY AVG(population) DESC;
	
##### 위와 동일한 결과값 출력됨
SELECT countrycode, AVG(population) avgPop, count(district) FROM city
	GROUP BY countrycode
	HAVING count(district) >= 100
	ORDER BY AVG(population) DESC;



	
	


