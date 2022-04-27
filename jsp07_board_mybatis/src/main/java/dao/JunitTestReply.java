package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dto.Reply;

class JunitTestReply {
	private ReplyDAO rdao = new ReplyDAO();
	@Test
	void testinsert() {
		Reply reply = new Reply();
		reply.setBnum(147);
		reply.setContent("hong");
		reply.setRestep(1);
		reply.setRelevel(1);
		int cnt = rdao.insert(reply);
		System.out.println(cnt+"건 추가");
		
	}
	@Test
	void testupdate() {
		Reply reply = new Reply();
		reply.setContent("댓글수정");
		reply.setRnum(5);
		int cnt = rdao.update(reply);
		System.out.println(cnt+"건 수정");
	}
	@Test
	void testdelete() {
		int cnt = rdao.delete(5);
		System.out.println(cnt+"건 삭제");
	}

	@Test
	void testselectOne() {
		Reply reply = rdao.selectOne(43);
		System.out.println(reply);
	}
	@Test
	void testselectList() {
		List<Reply> cnt = rdao.selectList(24);
		System.out.println(cnt+"건 조회");
	}
}
