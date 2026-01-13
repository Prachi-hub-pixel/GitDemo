package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestCaseUsingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Automation\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//storing the value of application url in string variable
		
		String url="https://www.eurail.com/en";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		//storing title in a string variable
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		//storing expected title with string variable
		
		String expectedTitle="Discover Europe by Train | Best Rail Pass in Europe | Eurail.com®";
		//Verification
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The Title of the page is " + actualTitle);
		}
		else
		{
		System.out.println("Title Verification is failed");
		System.out.println("Actual title name is " + actualTitle);
		System.out.println("Expected title name is " + expectedTitle);
		}
		
		//to verify page URL
		driver.findElement(By.linkText("Find your Pass")).click();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.eurail.com/en/eurail-passes";
		if(actualURL.equals(expectedURL))
		{
			System.out.println("The URL of the page is " + actualURL);
		}
		else
		{
		System.out.println("URL Verification is failed");
		System.out.println("Actual URL name is " + actualURL);
		System.out.println("Expected URL name is " + expectedURL);
		}
		
		//Page source method
		String pageSource =  driver.getPageSource();
		 int pageSourceLength = pageSource.length();
		 System.out.println("Total length of the page Source is " + pageSourceLength);
		 driver.close();
		 
		 
		
	}
	}
