package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SUNDAYpractice1 {

	public static void main(String[] args) {

	//	Ctrl + Shift + o
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");		
		
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		
		
		
	}

}
