package section89;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//frames and drag& drop methods
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		//can't automate frames without id 
		
		

	}

}
