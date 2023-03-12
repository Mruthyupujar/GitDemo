package section89;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		//nav-link-accountList
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().keyDown(Keys.SHIFT).sendKeys("Trimmer").build().perform();
		//using composite functions (perform actions after clicking this using actions class
		//how to enter upper case in search box butil =d composite action
		a.moveToElement(move).contextClick().build().perform(); //rightclick
		//drag & drop using actions class

		
		
	}

}
