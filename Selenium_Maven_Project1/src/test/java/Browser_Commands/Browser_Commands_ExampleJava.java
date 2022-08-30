package Browser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Commands_ExampleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String url= driver.getCurrentUrl();// currently opened url
		
		System.out.println("----Url of the application " + url);
		
		String title= driver.getTitle();// Title of the page
		
		System.out.println("-----title of the page-----" + title);//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		
		//String page_source=driver.getPageSource();
		
	    //System.out.println("-----page_source-----" + page_source);
		
		driver.close();// it will close only one browser window,currently focused window
		
		//driver.quit();//it will close all the window which opened by selenium code
	
		
		
		
		
		
		
		
		
	}

}
