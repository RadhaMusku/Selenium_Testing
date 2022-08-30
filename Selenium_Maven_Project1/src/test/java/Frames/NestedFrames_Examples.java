package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/nested_frames");
			
			driver.switchTo().frame("frame-top");
			
			driver.switchTo().frame("frame-left");
			
		String info=	driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		
		System.out.println("----info---" + info);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		
        String info_1=	driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		
		System.out.println("----info_1---" + info_1);
		
        driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		
        String info_2=	driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		
		System.out.println("----info_2---" + info_2);
		
		WebElement frame_address=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		driver.switchTo().frame(frame_address);
		
		String info_3=	driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		
		System.out.println("----info_3---" + info_3);
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
