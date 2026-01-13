package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     //open Website
     String url = "https://www.amazon.in/";
     driver.get(url);
     
     //maximize the window
     driver.manage().window().maximize();
     
     Thread.sleep(3000);
     
     //click on cart
     driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
     Thread.sleep(3000);

     //Go back to previous page
     driver.navigate().back();
     Thread.sleep(3000);

     //Navigate to forward
     driver.navigate().forward();
     Thread.sleep(3000);

     // refresh the browser
     driver.navigate().refresh();
     Thread.sleep(3000);

     
     driver.navigate().to("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=footer_gw_m_b_he");
     Thread.sleep(3000);
     
     //close the opened browser
     driver.close();
     
	}

}
