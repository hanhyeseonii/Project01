package service;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import dao.AirDAO;
import dto.Air;

import java.io.BufferedReader;
import java.io.IOException;

public class AirService {
	private AirDAO airDAO = new AirDAO();
    public int airparsing (String year) {
    	
    	List<Map<String, String>> clist = new ArrayList<Map<String,String>>();
    	
    	try {
    		String serviceKey="O%2FcQ%2FkkuKF%2Fr1Kt1FAJCcgsY336QA4Mhws1okFpN62ABAcXEYDvhGSvFpoa1yF1HZIuJRlFFC6T6YK946ecugQ%3D%3D";
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/UlfptcaAlarmInqireSvc/getUlfptcaAlarmInfo"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + serviceKey); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("5", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("year","UTF-8") + "=" + URLEncoder.encode("year", "UTF-8")); /*측정 연도*/
            urlBuilder.append("&" + URLEncoder.encode("itemCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*미세먼지 항목 구분(PM10, PM25), PM10/PM25 모두 조회할 경우 파라미터 생략*/
            System.out.println(urlBuilder.toString()); //url출력
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());

            
            //json파싱 : json-simple-1.1.1.jar
            JSONParser parser = new JSONParser();
            JSONObject object=(JSONObject)parser.parse(sb.toString());
            object =(JSONObject) object.get("response");
            System.out.println(object);
            object =(JSONObject) object.get("body");
            System.out.println(object);
            JSONArray array =(JSONArray)object.get("items");
            System.out.println(array);
            
            for(int i=0; i<array.size(); i++) {
            	object=(JSONObject) array.get(i);
            	System.out.println(object);
            	System.out.println("----------------------------");
            	
            	
            	///key의 목록을 가져와서 반복문
            	//set의 특징 : 중복데이터 안됨
            	Set<String> kset=object.keySet();
            	//맵 만들기
            	Map<String, String> map = new HashMap<String, String>();
            	for(String key:kset) {
            		//키와 값
            		System.out.println(key+":"+object.get(key));
            		map.put(key, (String)object.get(key));
            	}
            	System.out.println(map);
            	clist.add(map);
            }
          
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("리스트:"+clist);
    	
    	//dao에 clist넘기기
    	int cnt=airDAO.insert(clist);
    	System.out.println(cnt+"건 저장");
		return cnt;
    }
    public List<Map<String, String>> selectList(String districtName) {
    	//dao호출
    	return airDAO.selectList(districtName);
    }

}
