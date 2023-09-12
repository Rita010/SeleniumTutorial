package seleniumTutorialQ;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) {
		

	// Locators ?	
	//  <h2 id = "one" class = "three" name = "name">Hello</h2>
	// h2 - tag name; id - attribute	
		
		
// id Locator
		
// use the "id" attribute of HTML element to locate it
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
//		WebElement ele = driver.findElement(By.id("user-name"));
//		ele.sendKeys("standard_user");
//		

// name Locator
// name Locator of html element to select the element
		
//		 WebElement ele	= driver.findElement(By.name("user-name"));
//		 ele.sendKeys("standard_user");
		
// Class Name locator :
		
// Class locator of html element to select the element
		
//		WebElement ele = driver.findElement(By.className("input_error"));		
//		
//		ele.sendKeys("standard_user");
		
//		
////		List<WebElement>eleList = driver.findElements(By.className("input_error"));         
////		eleList.get(1).sendKeys("secret_sauce");    // (index 2 of input error = 1)    
		
		
		// CssSelector Locater
			//.className
			// #idvalue
			// tagName
			// tagName[attribute="value"]
			//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
		
		
		driver.findElement(By.cssSelector(".login_logo"));
		driver.findElement(By.cssSelector("#user-name"));
		driver.findElement(By.cssSelector("form"));
		driver.findElement(By.cssSelector("input[placeholder='Username'"));
		
		
		// Xpath
		// --- //tagName[@attribute="value"]
		
		
		
		//LinkText
		//PartialLinkText
		
		
	}

}
