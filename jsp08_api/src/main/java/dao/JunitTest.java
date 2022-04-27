package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import dto.Covid;

class JunitTest {
	CovidDAO covidDAO = new CovidDAO();
	@Test
	void testselectList() {
		//코로나 확진자 리스트 테스트
		Map<String, String> map = new HashMap<String, String>();
		map.put("startDt", "20220410");
		map.put("endDt", "20220419");
		
		List<Covid> clist= covidDAO.selectList(map);
		System.out.println(clist);
		
		
	}

}
