package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		String appURL = "https://bamboobox.ai/cdp-in-b2b/";
		driver.get(appURL);
		WebElement mercuaryImage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div/img"));
		
		if(mercuaryImage.isDisplayed()) {
			System.out.println("Image is dispalyed");
			System.out.println("Image text is "+ mercuaryImage.getAttribute("alt"));

		}
		else
		{
			System.out.println("Image is not dispalyed");
		}

		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(7000);
		driver.findElement(By.id("login_Layer")).click();
		System.out.println("Login image is clicked");
		
	}
}
