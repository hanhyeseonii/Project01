package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.Country;

public class CountryDAO {
	public List<Map<String, String>> selectList_iso(Map<String, String> map) {
		try(SqlSession session = MBConn.getSession() ){
			return session.selectList("CountryMapper.selectList_iso");
		}
	}

	public int insert(List<Map<String, String>> clist) {
		System.out.println(clist);
		//파싱한 맵의 리스트 저장
		int cnt =0;
		try(SqlSession session = MBConn.getSession()){ //try~with문 close자동
			for (Map<String, String> map:clist) {
				//한건조회
				System.out.println(map.get("sfty_notice_id"));
				Country country=session.selectOne("CountryMapper.selectOne",map.get("sfty_notice_id"));
				//만약 데이터가 존재한다면 update
				if (country!=null) {
					System.out.println("update");
					cnt+=session.update("CountryMapper.update",map);
				}else {
					//존재하지않는다면 insert
					System.out.println("insert");
					cnt+=session.insert("CountryMapper.insert",map);
				}
			}
			session.commit();
			return cnt;
		}
	}
	public List<Country> selectList(String iso){
		try(SqlSession session = MBConn.getSession()){
			return session.selectList("CountryMapper.selectList",iso);
		}
	}
	public Country selectOne(String sfty_notice_id) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectOne("CountryMapper.selectOne",sfty_notice_id);
		}
	}
}
