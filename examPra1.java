package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examPra1 {

	public static void main(String[] args) {

// Arrange		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
// Actions --- selecting the element	
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

// Dash board element
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
// Assertion
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		if(heading.isDisplayed()) {
			System.out.println("Test case Passed ");
		}
		else {
			System.out.println("Test case failed");
		}
	}

}
