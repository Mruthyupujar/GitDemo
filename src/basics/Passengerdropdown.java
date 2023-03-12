package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passengerdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			//driver.findElement(By.id("hrefIncAdt")).click(); //clicking + icon
			/*int i = 1;
	
			while (i<5) //4times will edit applying for this loop
				{
				//loops stops only conditions false if its not it will take infinite times 
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;

			}*/
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			for(int i=1; i<5;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				driver.findElement(By.id("hrefIncChd")).click();
				driver.findElement(By.id("hrefIncInf")).click();
				
				
				
				
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.className("buttonN")).getText());
			//select adults multiple times
			
			driver.close();			
			
			   

	}

}
