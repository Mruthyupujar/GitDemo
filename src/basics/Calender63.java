package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender63 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//round trip radio buttons and calendr how to select current date 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//extra class for current time (active) tturn class to css put(.claassname)
		//driver.findElement(By.xpath("(//a[@value='IXG'])")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active ui-state-hover")).click();
		//radiobutton 
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		//64 enabled & disabled attributes
		
		System.out.println(driver.findElement(By.id("div")).getAttribute("style").contains(""));//putting disable enable validation
		//put if condn
		if (driver.findElement(By.id("div")).getAttribute("style").contains("")) {
			System.out.println("its enabled");

			Assert.assertTrue(true);
			
		}
		else {
		Assert.assertTrue(false); 
		}
		/*
		 * // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

{

System.out.println("its enabled");

Assert.assertTrue(true);

}

else

{

Assert.assertTrue(false);

}
		 */
	}
	

}
