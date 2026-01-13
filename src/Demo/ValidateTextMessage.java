package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateTextMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
 String appURL = "https://demoqa.com/automation-practice-form";
 driver.get(appURL);
 driver.manage().window().maximize();
 
WebElement validatingTextMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
if(validatingTextMessage.isDisplayed()) {
	System.out.println("Message is dispalyed");
}
else{
	System.out.println("Message is not dispalyed");
}
//Comparing actual and Expected text
String expectedText = "Regestration";
String actuaText  = validatingTextMessage.getText();
if(actuaText.equals(expectedText))
{
	System.out.println("Actual and Expected results are same.The title of the page is" + actuaText );	
	}
else
{
	System.out.println("Actual and Expected results are not same.The text displayed is" + actuaText );	
	}	
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,700)");
driver.findElement(By.id("submit")).click();

//to validate the error text message we will use booking .com
driver.navigate().to("https://www.booking.com/");
driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div/div[4]/button")).click();

WebElement errorMessage = driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div/div[1]/div/div[2]/div"));
String expectedErrorMessage = "Enter a destination to start searching.";
String actualErrorMessage  = errorMessage.getText();
if (actualErrorMessage.equals(expectedErrorMessage))
{
	System.out.println("The actual and expected value is same.The value is " + actualErrorMessage );
}
else
{
	System.out.println("The actual and expected value is not same.The displayed value is " + actualErrorMessage );
}	
}

}
