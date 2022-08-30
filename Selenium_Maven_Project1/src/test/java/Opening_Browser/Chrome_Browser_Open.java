package Opening_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Browser_Open {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();	
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
		
	}

}
