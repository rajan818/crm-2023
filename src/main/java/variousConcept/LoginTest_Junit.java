package variousConcept;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;
	@Before
	public  void init(){
		
	    driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.techfios.com/billing/?ng=admin\n");
		
		driver.manage().window().maximize();}
	
	@Test
	public  void loginTest() {
		//insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click signIn
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public  void negloginTest() {
		//insert username
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		//insert password
		driver.findElement(By.id("password")).sendKeys("abc123g");
		// click signIn
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void teardown() {
		//close browser
		driver.close();
	}

}
