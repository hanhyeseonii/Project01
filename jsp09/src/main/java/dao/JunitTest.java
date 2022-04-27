package dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import service.AirService;


class JunitTest {
	AirDAO airDAO = new AirDAO();
	AirService airService = new AirService();
	
	@Test
	void testAir() {
		airService.airparsing("2020");
		
	}

}
