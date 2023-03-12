package Section13;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome options class options helps to  behavoir browser 
	
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//adding extensions 
		//options.addExtensions("");
		/*//how to set project at runtime by adding a proxy
		Proxy proxy = new proxy();
		proxy.setHttpProxy("ip adress (4444)")
		options.setCapability(" Proxy", proxy); //for java add one class as a proxy */
		//adding chrome options "chromedriver.chromium.org/capabilities"
		 //pass argument accept expired url and invoke browser 
		
		
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
