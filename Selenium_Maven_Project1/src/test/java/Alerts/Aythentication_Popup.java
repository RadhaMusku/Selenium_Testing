package Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aythentication_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Format:http://username:password@test.com
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			//http://admin:admin@the-internet.herokuapp.com/basic_auth
			
			
			
			
			
			
			//driver.close();
		
		
		
		
		
		
		
		
		

	}

}
