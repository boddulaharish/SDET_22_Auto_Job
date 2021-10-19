package gettingDataFrmCMD;

import org.testng.annotations.Test;

public class ReceiveDataTest {
	@Test
	public void getData() {
		String url = System.getProperty("url");
		System.out.println("+%%%%%%%%%%%%%%%"+url+"%%%%%%%%%%%%%%%");
		
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
