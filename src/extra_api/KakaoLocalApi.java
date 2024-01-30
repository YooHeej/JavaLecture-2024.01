package extra_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpHeaders;
import java.util.Map;

//도로명 주소로 부터 위도(latitude), 경도(longitude) 정보를 구해조는 메소드

public class KakaoLocalApi {
	
	public Map<String, Double> getGeocode(String addr) throws Exception {
	BufferedReader br = new BufferedReader(new FileReader("c:/Temp/KakaoLocalApi.txt"));
	String kakaoKey = br.readLine();
	br.close();
	String query = URLEncoder.encode(addr, "utf-8");
	String apiUrl = "https://dapi.kakao.com/v2/local/search/address.json"
					+ "?query=" + query;
	
	URL url = new URL(apiUrl);
	// 헤더 setting
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.setRequestProperty("Authorization", "KakaoAK" + kakaoKey);
	conn.setRequestProperty("content-type", "application/json");
	conn.setDoOutput(true);
	conn.setUseCaches(false);
	conn.setDefaultUseCaches(false);
	
	int responseCode = conn.getResponseCode();
	System.out.println(responseCode);
	
	br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
	StringBuffer sb = new StringBuffer();
	String line = null;
	while((line = br.readLine()) != null)
		sb.append(line);
	br.close();
	System.out.println(sb.toString());
	
	return null;
	}
}
