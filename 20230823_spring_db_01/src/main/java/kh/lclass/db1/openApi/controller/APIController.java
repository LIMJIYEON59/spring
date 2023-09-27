package kh.lclass.db1.openApi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController {
	//인코딩된 url은 %3 <-이런식으로 생겼다.
	private static final String serviceKey = 
			"ey51rbqUG4nLxm%2FIMXybyk%2FsuSNe95v4aIgn4Ydn0UhcJl91gToKXy7htiiqkWXyGCVxm6xyZpakkO4hk%2FLs3w%3D%3D";
	
	@ResponseBody
	@GetMapping(value = "/air.do")
	public String airPollution(String location) throws IOException {
		String url =  "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		//그래서 바로 아래처럼 작성가능하다.
		url += "?serviceKey=" + serviceKey;
		//디코딩된 url은 이렇게 작성해야한다. location에 담아야한다.
		url += "&sidoName=" + URLEncoder.encode(location, "UTF-8"); 
		url += "&returnType=json";
		
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection =
				(HttpURLConnection)requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		String responseText = "";
		String line;
		while((line = br.readLine()) != null) {
			responseText += line;
		}
		br.close();
		urlConnection.disconnect();
		return responseText;
	}
	/*
	 * @GetMapping("/index") public String index() { return "index"; }
	 */
}
