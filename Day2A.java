package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.saucedemo.com/");
		
		WebElement username = dr.findElement(By.cssSelector("#user-name"));
		WebElement password = dr.findElement(By.cssSelector("#password"));
		WebElement login = dr.findElement(By.cssSelector("#login-button"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		WebElement heading = dr.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else 
		{
			System.out.println("Test case failed");
		}
		
	}

}
