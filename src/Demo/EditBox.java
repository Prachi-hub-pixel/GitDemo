package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

String appUrl = "https://demoqa.com/automation-practice-form";
driver.get(appUrl);

driver.manage().window().maximize();

//firstName

WebElement firstName = driver.findElement(By.id("userName-label"));

//Verify if first name is displayed
if(firstName.isDisplayed())
{
	System.out.println("First Name is dispalyed");
}
else {
	System.out.println("First Name is not dispalyed");
}
//Verify if first name is enabled
if(firstName.isEnabled())
		{
	System.out.println("First Name is enabled");
}
else {
	System.out.println("First Name is not enabled");
}
//Enter first Name
WebElement enterName = driver.findElement(By.id("firstName"));
if(enterName.isEnabled())
{
	enterName.sendKeys("Prachi");
	System.out.println("First Name value is entered");
}
else
{
	System.out.println("Unable to entered the first Name");
}
//Get the value from the first name
String fneditbox = enterName.getAttribute("value");
System.out.println("The value present in first name " + fneditbox);

Thread.sleep(3000);

//clear the value
enterName.clear();

String fneditbox1 = enterName.getAttribute("value");
System.out.println("The value present in first name " + fneditbox1);


	}

}
