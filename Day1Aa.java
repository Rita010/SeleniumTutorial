package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Aa {

	public static void main(String[] args) {
		
		// ctrl+shift+o ------ to import org.openqa.selenium.chrome.ChromeDriver;

	// local, development, staging, canary, production
	// local test test4 test6 production
	// webElement --- 13 methods : sendKey(to write), click(function), clear(clear out element), text
	// return type of findElement method is - web element							   
		
	
	// Arrange
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
	
		
		
	// Actions
	// Selecting the element
		
		WebElement username = dr.findElement(By.cssSelector("#user-name"));
		WebElement password = dr.findElement(By.cssSelector("#password"));
		WebElement login = dr.findElement(By.cssSelector("#login-button"));
	
	// Dash board element
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		login.click();	
		
	// Assertion	
		
	//  login 'Swag Labs' with the given username and password to get heading element 
		
		WebElement heading = dr.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
	}

}
