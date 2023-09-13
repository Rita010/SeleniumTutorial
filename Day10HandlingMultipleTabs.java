package seleniumTutorialQ;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10HandlingMultipleTabs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());		

		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("rita");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("khatiwoda");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwoda50@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("I am learning Selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	

}
