package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1A {

	public static void main(String[] args) {
		
	
		
	// path of googleChrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	// path of Swag Labs
		
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement UserName = driver.findElement(By.cssSelector("#user-name"));
		
		WebElement Password = driver.findElement(By.cssSelector("#password"));
		
		WebElement Login = driver.findElement(By.cssSelector("#login-button"));
		
		
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Login.click();
		
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span "));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed");
			
		}
		else
		{
			System.out.println("Test case failed");
		}	
		
	}

}

