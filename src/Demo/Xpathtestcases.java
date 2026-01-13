
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.easemytrip.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"FromSector_show\"]")).sendKeys("Delhi");
	    driver.findElement(By.xpath("//*[@id=\"Editbox13_show\"]")).sendKeys("Mumbai");
	    driver.findElement(By.xpath("//*[@id=\"divSearchFlight\"]/button")).click();
	    	

	}

}
