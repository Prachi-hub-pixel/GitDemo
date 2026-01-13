package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
String appURL = "https://www.booking.com/";
driver.get(appURL);

driver.findElement(By.id("cars")).click();
WebElement checkBox = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div/div[1]/div/form/div[2]/div/div[1]/label/span[2]"));
if(checkBox.isDisplayed()) {
	System.out.println("Check box is displayed");
}
else
{
	System.out.println("Check box is not displayed");
}
if(checkBox.isEnabled()) {
	System.out.println("Check box is enabled");	
}
else
{
	System.out.println("Check box is not enabled");
}
checkBox.click();
if (checkBox.isSelected())
{
	
	System.out.println("Check box is selected");	
}
else
{
	System.out.println("Check box is not selected");
}

checkBox.click();
//UnCheck check box
if (checkBox.isSelected())
{
	System.out.println("Check box is unchecked");	
}
else
{
	System.out.println("Unable to uncheck the check box");
}


	}

}
