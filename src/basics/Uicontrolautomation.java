package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uicontrolautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 //static dropdown by select tag ""Curency"
		 WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		   
		 Select dropdown = new Select(staticDropdown);
		 dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		
		
		 
		 

	}

}
