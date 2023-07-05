########################################
#
#	테이블 Export/Import
#
########################################

/*
 * 1. secure_file_priv 확인
 * 
 * 		C:/ProgramData/MySQL/MySQL Server 8.0/Uploads
 */
SHOW VARIABLES LIKE 'secure_file_priv';

/*
 * 2. Export(Table -> File)
 */
SELECT * FROM song INTO OUTFILE 
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';

/*
 * 3. Import(File --> Table)
 */
# 데이터 삭제
TRUNCATE song;

# 데이터 로드
LOAD DATA INFILE 
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	INTO TABLE song
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';

# 데이터 확인


/*
 * ## 연습문제
 */ 
# 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT continent, COUNT(*) noc, SUM(GNP) sumGnp, round(AVG(GNP)) avgGNP
	FROM country
	GROUP BY continent;
	
	
# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
# ( 대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent, r.Name, l.Name, l.Population FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	WHERE r.continent='Asia'
	ORDER BY l.Population DESC 
	LIMIT 10;
	
	
# 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는?
# (도시명, 인구수, 언어명)
SELECT l.Name, l.Population, r.`Language` FROM city AS l
	JOIN countrylanguage AS r
	ON l.CountryCode = r.CountryCode 
	WHERE r.IsOfficial = 'T'
	ORDER BY l.Population DESC	
	LIMIT 10;
	