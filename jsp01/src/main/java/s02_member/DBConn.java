package s02_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//db 컨넥션을 반환
public class DBConn {
	//static: 정적메소드
	static Connection getConnection() {
		Connection con=null;
		//url, user, password
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="hr";
		String password ="hr";
		//오라클 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//컨넥션 객체 생성
			con = DriverManager.getConnection(url, user, password);
			System.out.println("컨넥션 완료");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
