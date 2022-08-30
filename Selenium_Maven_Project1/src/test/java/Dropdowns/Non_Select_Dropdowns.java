package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Non_Select_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> dropdown_options=driver.findElements(By.xpath("//li[contains(@onclick,'javascript')]"));
		
	int count=	dropdown_options.size();
		
		for(int i=0;i<count;i++)
		{
		String opt_txt=	dropdown_options.get(i).getText();
		
		System.out.println("----opt_text----" +opt_txt);
		
		if(opt_txt.contains("Albania"))
		{
			dropdown_options.get(i).click();
			break;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
