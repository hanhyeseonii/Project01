package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {
	private MemberService memberService = new MemberService();
	@Test
	void test() {
		String scpw=memberService.sha256("1111", "scpw");
		System.out.println(scpw);
		
	}
	@Test
	void testSalt() {
		String salt=memberService.saltmake();
		System.out.println(salt);
		System.out.println(salt.length());
	}
}
