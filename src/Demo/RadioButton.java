package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
String appURL = "https://www.booking.com/";
driver.get(appURL);

driver.findElement(By.id("flights")).click();

WebElement radioButton = driver.findElement(By.xpath("//*[@id='basiclayout']/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/fieldset/div/div[2]/label/span[2]"));

if(radioButton.isDisplayed())
{
	System.out.println("Radio Button is displayed");
}
else
{
	System.out.println("Radio Button is not displayed");
}
if(radioButton.isEnabled())
{
	System.out.println("Radio Button is enabled");
}
else
{
	System.out.println("Radio Button is not enabled");
}
if(radioButton.isSelected())
{
	System.out.println("Radio Button is selected");
}
else
{
	System.out.println("Radio Button is not selected");

}
radioButton.click();

if(radioButton.isSelected())
{
	System.out.println("Radio Button is selected");
}
else
{
	System.out.println("Radio Button is not selected");

}
	}

}
