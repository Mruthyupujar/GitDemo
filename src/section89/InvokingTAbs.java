package section89;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingTAbs {
	//navigate to webpage and put all details 
	//open another tab copy text and paste to previous tab
	//it is applicable only selenium 4.0 only multi task
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//open another tab or window
		driver.switchTo().newWindow(WindowType.TAB);
		//open new window 
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().window(null)  
		Set<String> handles	=driver.getWindowHandles();//handle multiple windows child window id 
	 Iterator<String> it= handles.iterator();
	 String parentWindowId = it.next(); //parent window id is present 
	 String ChildWindow = it.next();
	 driver.switchTo().window(ChildWindow);
	 driver.get("https://www.rahulshettyacademy.com/");
	 //add css selector of text 
	 String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")) .get(1).getText();
	 //switch back to parent window pass [arent window id
	 driver.switchTo().window(parentWindowId);
	 WebElement name=driver.findElement(By.cssSelector("[name='name']"));
	 name.sendKeys(courseName);
	 //getting screenshot is file only 
	 WebElement nmae = driver.findElement(By.cssSelector("[name='name']")); 
	 name.sendKeys(courseName);
	 File file=name.getScreenshotAs(OutputType.FILE);

	 FileUtils.copyFile(file, new File("logo.png"));
			 
	//get how to width & height size of an element
	 System.out.println(name.getRect().getDimension().getHeight());

	 System.out.println(name.getRect().getDimension().getWidth());	 
			 
	 
	 
	}

}
