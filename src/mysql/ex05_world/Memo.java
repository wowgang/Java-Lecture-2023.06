package mysql.ex05_world;

//e.getMessage() : 에러의 원인을 간단하게 출력합니다.
//e.toString() : 에러의 Exception 내용과 원인을 출력합니다.
//e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.

/*
* Statement
* SQL문을 수행하는 과정에서 매번 컴파일을 하기 때문에 성능상 이슈 발생
* 실행되는 SQL문을 확인 가능
* 
* String sql = "SELECT name, memo From TABLE WHERE name =" + num
* Statement stmt = conn.createStatement();
* ResultSet rst = stmt.executeQuery(sql);
* 
*/


/*
* PreparedStatement
* 컴파일이 미리 되어있기 때문에 Statement에 비해 좋은 성능
* 특수문자를 자동으로 파싱
* "?" 부분에만 변화를 주어 쿼리문을 수행하므로 실행되는 SQL문을 파악히기 어려움
* 사용자 입력값으로 쿼리문을 실행하는 경우

* String sql = "SELECT name, memo FROM TABLE WHERE num=?"
* PreparedStatement pstmt = conn.prepareStatement(sql);
* pstmt.setInt(1,num);
* ResultSet rst = pstmt.executeQuery(sql);
* 
*/




public class Memo {

}
