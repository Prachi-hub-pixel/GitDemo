package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirsttestStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.naukri.com/");
    driver.manage().window().maximize();
    
    //Example of Link Locator
    driver.findElement(By.linkText("Register")).click();
    
    //Exapmle by ID locator
    driver.findElement(By.id("name")).sendKeys("ABC");
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("password")).sendKeys("123456");
    driver.findElement(By.id("mobile")).sendKeys("9999988888");

	}

}
