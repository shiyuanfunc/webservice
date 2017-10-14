package test;

import phonewebservice.MobileCodeWS;
import phonewebservice.MobileCodeWSSoap;

public class TestPhone {
		

		public static void main(String[] args) {
			
			MobileCodeWS mobileCode = new MobileCodeWS();
			MobileCodeWSSoap mobileCodeWSSoap = mobileCode.getMobileCodeWSSoap();
			String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("15518399506", "");
			System.out.println(mobileCodeInfo);
			
		}
}
