package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
String appURL = "https://demoqa.com/automation-practice-form";
driver.get(appURL);
WebElement submitButton = driver.findElement(By.id("submit"));
if (submitButton.isDisplayed()) {
	System.out.println("Sumbit button is displayed");
	}
else{
	System.out.println("Sumbit button is not displayed");
	}
if (submitButton.isEnabled()) {
	System.out.println("Sumbit button is enabled");
	}
else{
	System.out.println("Sumbit button is not enabled");
	}
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,600)");
submitButton.click();
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,-600)");


System.out.println("Git Command");

	}

}
