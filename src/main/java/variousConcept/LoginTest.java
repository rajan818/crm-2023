package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;


	public static void main(String[] args) {
		init();
		loginTest();
		teardown();
		
		

	}
	
	public static void init(){
		//setup for system property
	    driver = new ChromeDriver();
		//delete cookies
		driver.manage().deleteAllCookies();
		//go to website
		driver.get("http://www.techfios.com/billing/?ng=admin\n");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//maximize
		driver.manage().window().maximize();}
	public static void loginTest() {
		//insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click signIn
		driver.findElement(By.name("login")).click();
	}
	public static void teardown() {
		//close browser
		driver.close();
	}

}
