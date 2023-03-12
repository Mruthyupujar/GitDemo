package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinkcheckbox60 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			//checkbox & calender on page 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id=*-'friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=*-'friendsandfamily']")).isSelected());
		// isSelected() =if checkbox selected or not 
		//print no's of check box are present & count the no's of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("div[id='UnmrDiv']")).click();
		Thread.sleep(3000);
	}

}
