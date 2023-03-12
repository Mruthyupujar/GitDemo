package Section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenlinksHandle {
		//broken link not opens it shows 404 errors
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// devloper (inspection tab) tool select network tab select xhr tab 
		//some java methods will call urls and gets u to the status code selenium will not work brkoen links 
		//step 1 all urls tied up to the links by (get href )
		//if status code get >400 then url is not working link which is tied to url is broken 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> links=  driver.findElements(By.cssSelector("li[class = 'gf-li']a"));
		  //List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert sa = new SoftAssert();
		for (WebElement link : links) //enchanced for loop
		{
			
			
		String url = link.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcide= conn.getResponseCode();
		System.out.println(respcide);
		sa.assertTrue( respcide<400, "The LInk with TEXT" +link.getText()+ "is broken with code" +respcide );
		
		/*if (respcide>404)
		{
			System.out.println("The LInk with TEXT" +link.getText()+ "is broken with code" +respcide );
			Assert.assertTrue(false);
			//hard assertion 
			//soft assertion in testng
		}*/
		}
		 sa.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
		//a[href*= "soapui"]
		//String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		/*String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		// open connection method to identify status code
	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	//tell what kind of request metod
	conn.setRequestMethod("HEAD");
	conn.connect();
	int respcide= conn.getResponseCode();
	System.out.println(respcide);*/
	//broken link 
	//get all links and broken links are finding (for each & every links )
	//all the footer links 
	
	
	
	}
	

}
