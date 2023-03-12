package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//popup It is not html selenium cant handle alert directly
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//switchto & Alert it is brwoser to control alert 
		//confirm alert getting 2buttoons like onk an cancel whils clicking cancel buton 
		// handle that use dismiss method 
		driver.findElement(By.id("name")).sendKeys("text");

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());



		driver.switchTo().alert().dismiss();



		driver.close();















		   






	}

}
