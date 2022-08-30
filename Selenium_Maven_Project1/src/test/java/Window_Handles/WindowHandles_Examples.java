package Window_Handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
    String parent_windowid=driver.getWindowHandle();
	
	System.out.println("-----parent_windowid----" +parent_windowid);
	
	driver.switchTo().frame("login_page");
	
	driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
	
	Thread.sleep(3000);
	
    Set<String>	all_window_ids=driver.getWindowHandles();
    
    int count=all_window_ids.size();	
    
    System.out.println("---count---" +count);//2
    
   Iterator<String>it= all_window_ids.iterator();
   
  String Parent_window_id= it.next();
  
  System.out.println("----Parent_window_id----" +Parent_window_id);
  
  String Child_window_id=it.next();
  
  System.out.println("----- Child_window_id------" + Child_window_id);
  
  driver.switchTo().window(Child_window_id);
  
  String childwindow_Title=driver.getTitle();
  
  System.out.println("---childwindow_Title----" +childwindow_Title);
  
  driver.switchTo().window(Parent_window_id);
  
  String parentwindow_Title=driver.getTitle();
  
  System.out.println("----- parentwindow_Title-----" + parentwindow_Title);
    
    
//	driver.close();
	
	driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
