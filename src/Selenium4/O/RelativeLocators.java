package Selenium4.O;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement nameEditbox = driver.findElement(By.cssSelector("[name ='nmae']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above (nameEditbox)).getText()); //import package static relatoive locators for above 
		//below label
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for = 'dateofBirth']")); //flex webelement not identified on selenium 
		driver.findElement(with(By.tagName("ïnput")).below(dateofBirth)).click();
		//left checkbox descripton 
		WebElement icecreamLabel= driver.findElement(By.xpath("//label[text() = 'Check me out if you love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLabel)).click();
		//rightof locator //relative locators find by tagname only 
		
		
		WebElement rdb = driver.findElement(By.id("ïnLineRadio1"));
		//driver.findElement(with (By.tagName("label")).toRightOf(rdb)).getText());
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());		
		
		

	}

}
