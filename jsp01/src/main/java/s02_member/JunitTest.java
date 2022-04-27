package s02_member;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testDBConn() {
		//db컨넥션
		Connection con= DBConn.getConnection();
		System.out.println(con);
		//con이 null이 아닐 때 성공
		assertNotNull(con);
	}
	@Test
	void testInsert() {
		//Member 객체 만들기
		Member member = new Member();
		member.setUserid("Hong");
		member.setPasswd("1111");
		member.setName("자바");
		member.setEmail("java@naver.com");
		System.out.println(member);
		
		MemberDAO mdao = new MemberDAO();
		int cnt=mdao.insert(member);
		System.out.println(cnt+"건 추가");
	}

}
