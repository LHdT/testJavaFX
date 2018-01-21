package appComponents;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.webservicex.com/globalweather.asmx?wsdl");
			
		} catch (MalformedURLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
