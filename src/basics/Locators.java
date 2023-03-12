package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait mechanism
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.useconvo.com");
		driver.get("https://prod-tool.useconvo.com/");
		driver.findElement(By.className("navigation-link-signup w-button")).click();
		//login flow automate wrong password 
		driver.findElement(By.id("login-email")).sendKeys("mruthyunjay+78@useblitz.com");
		driver.findElement(By.name("password")).sendKeys("werty");
		driver.findElement(By.id("show-signup")).click();
		//2 locators 1.css selector 2.xpath
		//construct css 
		System.out.println (driver.findElement(By.cssSelector("div.error")).getText());
		//forgot password
		//driver.findElement(By.linkText(""))
		//driver.findElement(null)
		
		
		
	//	driver.close();
		
	}

}
