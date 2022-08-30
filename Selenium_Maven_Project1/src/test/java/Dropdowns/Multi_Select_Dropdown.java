package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		
		WebElement vb=   driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		Select slct=new Select(vb);
		
        boolean multi_select_dropdown=slct.isMultiple();
		
        System.out.println("-----multi_select_dropdown------" + multi_select_dropdown);
        
        slct.selectByVisibleText("Texas");
        
        Thread.sleep(2000);
        
        slct.selectByVisibleText("Washington");
        
        Thread.sleep(3000);
        
        slct.selectByIndex(0);
        
        Thread.sleep(2000);
		
        slct.deselectByVisibleText("Texas");
        
        List<WebElement> optionsinfo=slct.getOptions();//8 webelements
        
       int count= optionsinfo.size();
       
       System.out.println("-----count-----" +count);
       
       for(int i=0;i<count;i++)
       {
    	 String txt=  optionsinfo.get(i).getText();
    	 
    	 System.out.println("----txt---" +txt);
       }
       
      String first=slct.getFirstSelectedOption().getText();
      
      System.out.println("---first----" +first);
        
        
        
        
        
        
        driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
