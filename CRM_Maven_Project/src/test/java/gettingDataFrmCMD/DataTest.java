package gettingDataFrmCMD;

import org.testng.annotations.Test;

public class DataTest {

	@Test
	public void gettData() {
	
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
}
