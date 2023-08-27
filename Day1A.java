package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1A {

	public static void main(String[] args) {
		
	
		
	// path of googleChrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
	
	// path of Swag Labs
		
		dr.get("https://www.saucedemo.com/");
		
		
		WebElement UserName = dr.findElement(By.cssSelector("#user-name"));
		
		WebElement Password = dr.findElement(By.cssSelector("#password"));
		
		WebElement Login = dr.findElement(By.cssSelector("#login-button"));
		
		
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Login.click();
		
		WebElement heading = dr.findElement(By.cssSelector("#header_container > div.header_secondary_container > span "));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed");
			
		}
		else
		{
			System.out.println("Test case failed");
		}	
		
	}

}

