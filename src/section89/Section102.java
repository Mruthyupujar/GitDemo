package section89;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section102 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//selenium will nor aabke to write script
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//get the css selector by js using console type (document.queryselector(".textvalue").scrolltop=no value
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').ScrollTop=500");
		List<WebElement> values= (List<WebElement>) driver.findElement(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for (int i =0;i<values.get();i++) {
			sum =sum+ Integer.parseInt(values.get(i).getText());//51
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmout")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	}

}
