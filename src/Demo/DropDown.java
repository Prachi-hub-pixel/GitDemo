package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		String appURL = "https://www.booking.com/";
		driver.get(appURL);
		
		driver.findElement(By.id("flights")).click();
		
		WebElement typeDropDown = driver.findElement(By.xpath("//select[@class='Select-module__select___ZWQHS']"));
		
		if(typeDropDown.isDisplayed())
		{
			System.out.println("Drop drown is dispalyed");
		}
		else
		{
			System.out.println("Drop drown is not dispalyed");
		}	
		
		if(typeDropDown.isEnabled())
		{
			System.out.println("Drop drown is enabled");
		}
		else
		{
			System.out.println("Drop drown is not enabled");
		}	
		//Creating a select object
		Select dropDown = new Select(typeDropDown);
		//dropDown.selectByVisibleText("Business");
		
		//dropDown.selectByIndex(3);
		
		dropDown.selectByValue("PREMIUM_ECONOMY");
		
	
	}

}
