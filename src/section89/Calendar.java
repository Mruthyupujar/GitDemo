package section89;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// select specific date and month select expected date when it is in current
		// date code
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.path2usa.com/travel-companions");
		driver.get("https://www.path2usa.com/travel-companions");
		/* driver.findElement(By.xpath(".//*[@id='travel_comp_date']")).click();
//[class='datepicker-days'] [class='datepicker-switch'] for multipleattribute 
		// driver.findElement(By.cssSelector("[class='datepicker-days']
		// [class='datepicker-switch']")).getText().contains("May");
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		}
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day "));
		int count = driver.findElements(By.className("flatpickr-day ")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
				break; */
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
			}
		}

	}

}
