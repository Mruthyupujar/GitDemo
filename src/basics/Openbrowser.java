package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\firefoxe1\\geckodriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //waiting for page is fully ready
		driver.navigate().to("https://www.useconvo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		//driver1.get("https://www.useconvo.com/");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver1.getTitle());

		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver1.getCurrentUrl());
		//driver.close();
		//driver1.close();
		//driver.quit();
		
	}

}
