package appComponents;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import appComponents.ws.net.webservicex.GetCitiesByCountry;
import appComponents.ws.net.webservicex.GlobalWeather;
import appComponents.ws.net.webservicex.GlobalWeatherSoap;



public class AppTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.webservicex.com/globalweather.asmx?wsdl");
			QName qname = new QName("http://www.webserviceX.NET", "GlobalWeather");
			
			Service service = Service.create(url, qname);
			
			GlobalWeatherSoap instance = service.getPort(GlobalWeatherSoap.class);
			
			
			System.out.println(instance.getCitiesByCountry("spain"));
			
			
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
