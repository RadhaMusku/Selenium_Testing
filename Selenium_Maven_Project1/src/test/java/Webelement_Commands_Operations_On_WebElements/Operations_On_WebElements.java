package Webelement_Commands_Operations_On_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operations_On_WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sme.spicejet.com/airline/smeregister");
		
		//WebElement Org_add=driver.findElement(By.id("smeRegistration_OrganizationName"));
		
	    WebElement org_add_1=driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']"));

	    org_add_1.sendKeys("MBLR8");
	    
	    //driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']")).sendKeys("RISHI0508");
	    
	    WebElement firstname=driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']"));
	    
	    firstname.sendKeys("Mahesh");
	    
	   // driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("Mahesh");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).clear();
	    
	    Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("Radha");
	    
	    driver.findElement(By.xpath("")).click();
	    
	  String attributeInfo=driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).getAttribute("name");//smeRegAuthorizedSignatoryDetail.FirstName
	  
	  System.out.println("-----attributeInfo---" + attributeInfo);
	  
	   String tagname=driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getTagName();
	   
	   System.out.println("-----get tegname----" + tagname);//h1
	   
	   String Text=driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getText();
	   
	   System.out.println("----Text------" + Text);
	   
	  String Color=driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getCssValue("color");
	  
	  System.out.println("-----color----" + Color);
	   
	   driver.close();
	   

	   

	  
	  
	  
	  


	    

	    

	}

}
