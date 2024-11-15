package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LabExam {
	public static WebDriver wd;
	
  @Test
  public void name() {
	 
	  wd.findElement(By.xpath("//input[@name='name']")).sendKeys("Aditya");
	  String myname=  wd.findElement(By.xpath("//input[@name='name']")).getAttribute("value");
		 
	        System.out.println("Name: " + myname);
	  }
  
  
  @Test
  public void email() {
      wd.findElement(By.xpath("//input[@name='email']")).sendKeys("adityacahavan@gmail.com");
	  String  myemail = wd.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
    
	  System.out.println("Email: " + myemail);
  }
  
  
  @Test
  public void printTitle() {
      String title = wd.getTitle(); 
      System.out.println("Page Title: " + title);
  }

  
  @Test
  public void printUrl() {
      String url1 = wd.getCurrentUrl();  
      System.out.println(" URL: " + url1);  
  }

  
  
 
  @Test
  public void signup() {
      // Submit the form after entering name and email
      
	  
	  wd.findElement(By.xpath("//button[contains(@class, 'btn btn-default') and contains(@class, 'submit')]")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	    wd = new ChromeDriver();
	      wd.get("https://automationexercise.com/login");
	      wd.manage().window().maximize();   
  }

  @AfterTest
  public void afterTest() {
	  
	//  wd.findElement(By.xpath("//button[@id='submit']" )).click();
	//  wd.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	  
	  
	  printTitle();
	  printUrl();
	  name();
	  email();
	  
	  wd.close();
  }
  

}
