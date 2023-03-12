package section89;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// give me the count link the page tag for <a>, COunt of fooetr section ,
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElements(By.tagName("a")).size()); // links count
		// get me the count of links in footer section (down)
		// how to create driver subset
		WebElement footerdriver = driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// limitimg webdriver scope IN fooetr section interst in first column links
		footerdriver.findElement(By.className("navFooterLinkCol navAccessibility"));
		WebElement columndriver = footerdriver.findElement(By.xpath("div[@class='navFooterLinkCol navAccessibility']"));

		System.out.println(columndriver.findElements(By.tagName("a")));
		// Click on each link in the column check if the windows are open
		// go to each tab grab title
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			// //go to each tab grab title
			Thread.sleep(5000);
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}

	}

}
