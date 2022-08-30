package Webelement_Commands_Operations_On_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operations_on_WebElements_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.monsterindia.com/");
		
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.xpath("(//span[contains(normalize-space(),'Jobseeker Login')])[3]")).click();
		
		//Thread.sleep(3000);
		
		boolean btn_exits=driver.findElement(By.xpath("//button[@id='but1']")).isDisplayed();
		
		System.out.println("----Btn----" + btn_exits);//true
		
		boolean btn_enable=driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
		
		System.out.println("----btn_enable----" + btn_enable);//false
		
		boolean btn_enable2=driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
		
		System.out.println("----btn_enable----" + btn_enable2);//true

	boolean Selected_info=driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
	
	System.out.println("-----Selected_info----" + Selected_info);//false
	
boolean Selected_info2=driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
	
	System.out.println("-----Selected_info----" + Selected_info2);//true
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
