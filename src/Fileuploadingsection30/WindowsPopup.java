package Fileuploadingsection30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		//follow the syntax with credentials
		driver.get("http://admin:admin@ the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
		
	}

}
