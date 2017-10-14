package test;

import java.util.List;

import webservicetest.ArrayOfString;
import webservicetest.WeatherWebService;
import webservicetest.WeatherWebServiceSoap;

public class TestWeather {
		
	public static void main(String[] args) {
		

	WeatherWebService weatherService = new WeatherWebService();
	WeatherWebServiceSoap soap=weatherService.getWeatherWebServiceSoap();
	
	 ArrayOfString arrayOfString=soap.getWeatherbyCityName("֣��");
	 
	 	//遍历结果
	      List<String> list=arrayOfString.getString();
	     
	         for(String str:list){
	           System.out.println(str);
	          System.out.println("**************");
        }
	}
}

