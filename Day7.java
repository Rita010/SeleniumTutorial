package seleniumTutorialQ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		// driver.findElement(By.id("user-n"));    // Wrote this line for the element which is not there.It should hold the script for 10 seconds and if element not found and then it throws the error 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // it overrides the implicitWait of 10 Seconds and below this implicitWaits will be 5 seconds
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

		driver.close();
		
		
		
		

	}

}
