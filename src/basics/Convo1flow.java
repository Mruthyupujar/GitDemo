package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Convo1flow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://qa-sde.useconvo.com/");
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("mruthyunjay+425@useblitz.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("qwerty");
		driver.findElement(By.xpath("//button[@id='show-signup']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='text']")).click(); //clicking dropdown
		driver.findElement(By.xpath("//a[normalize-space()='Billing']")).click(); //select billing page 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn blue large full-width mt-24']")).click();
		Thread.sleep(2000);
		//payment method page appears
		driver.findElement(By.xpath("//button[@class='btn grey grey-skip outlined']")).click();//skip button
		driver.findElement(By.xpath("//div[@class='text']")).click();
	//logout 
	//	driver.findElement(By.cssSelector("a[role='button']")).click();
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
