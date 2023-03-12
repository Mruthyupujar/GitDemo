package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Chapter61 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Test-ng is one of framework
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		
		//count of number of checkboxes
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			Thread.sleep(3000);
			
	}

}
