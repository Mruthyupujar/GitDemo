package Section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {
	//deleting cookies 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//delete all cookies
		//driver.manage().deleteCookieNamed("asdfg"); //delete particulat cookkie
		//click on any link go to login page 
		//driver.manage().addCookie(null);//adding a cookies
		driver.get("https://www.google.com/");
		
	}

}
