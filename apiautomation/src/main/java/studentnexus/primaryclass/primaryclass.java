package studentnexus.primaryclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class primaryclass {
	
	public static Properties prop;
	public static String Propertyfilepath="C:\\Users\\ravishankarhn\\eclipse-workspace\\apiautomation\\src\\main\\java\\studentnexus\\config\\config.properties";
	public static RequestSpecification request;
	public static Response response;
	public static Response responsebody;
//	public static String url="https://btpcminexus05.campusmgmt.com:9500";
	//public static String entityurl="/api/commands/StudentAccounts/AccountStatus/Save";
	
	
	
	public static RequestSpecification initialization()
	{
		prop=new Properties();
		try {
		FileInputStream fileinputstream=new FileInputStream(Propertyfilepath);
		
			prop.load(fileinputstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(prop.getProperty("baseurl"));
		System.out.println(prop.getProperty("entityurl"));
		
		RestAssured.baseURI=prop.getProperty("baseurl")+prop.getProperty("entityurl");	
		request=RestAssured.given();
		request.header("Content-Type","application/json");
		request.auth().preemptive().basic(prop.getProperty("username"), prop.getProperty("password"));
		request.config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()));
		return request;

	
	}

}
