package Find_Elements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_Elements_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sme.spicejet.com/Airline/SMERegister");
        
		//WebElement wb1= driver.findElement(By.xpath(""));
            
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		int count=alllinks.size();
		System.out.println(count);
		
		for(int i=1;i<=count;i++)
		{
			String link_txt=alllinks.get(i).getText();
			System.out.println("link_txt" + link_txt);
		}
		
		
	}

}
