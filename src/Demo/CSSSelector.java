package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\prach\\\\Automation\\\\Drivers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//locate element by CSS selector
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Delhi temperature tomorrow");
		driver.findElement(By.name("btnK")).click();
		
		//locate element by class Name
		driver.findElement(By.className("gb_B")).click();
		driver.findElement(By.className("Rq5Gcb")).click();
	}

}
