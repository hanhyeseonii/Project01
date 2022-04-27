package service;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

class JunitTest {
	CovidXMLService covidService = new CovidXMLService();	
	
	@Test
	void test(){
	//코로나 확진자
	covidService.covidParsing("20200405", "20200410");
		
	}
	
	
	
	//컨트리 테스트
	CountryJSONService countryService = new CountryJSONService(); 
	@Test
	void testCountry() {
		countryService.countryParsing("DE");
			
	}
		
	//문화위치정보
	CultureService cultureService = new CultureService();
	@Test
	void testCultre() {
		Map<String, Object> map=cultureService.cultureParsing("노원정보도서관");
		System.out.println(map);
	}
	
	//지오코딩 테스트
	@Test
	void testCultreGeocoding() {
		Map<String, Double> map=cultureService.geocoding("서울 종로구 명륜4가");
		System.out.println(map);
	}
}