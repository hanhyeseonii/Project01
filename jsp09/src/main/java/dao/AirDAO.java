package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.Air;


public class AirDAO {
	
	public int insert(List<Map<String, String>> clist) {
		System.out.println(clist);
		//파싱한 맵의 리스트 저장
		int cnt =0;
		try(SqlSession session = MBConn.getSession()){ //try~with문 close자동
			for(Map<String, String> map :clist) {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				cnt+=session.insert("AirMapper.insert",map);
			}
			session.commit();
			
		} //colse
		
		return cnt;
	}
	public List<Map<String, String>> selectList(String districtName) {
		try(SqlSession session = MBConn.getSession()){
			return session.selectList("AirMapper.selectList",districtName);
		}
	}
}
