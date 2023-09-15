package seleniumTutorialQ;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY11WindowHandleInAnotherWay {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
				
		driver.findElement(By.cssSelector("#contact-us")).click();   //<a href="Contact-Us/contactus.html" target="_blank" id="contact-us">
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator <String> s = windows.iterator();
		String parentWindowA = s.next();
		System.out.println(parentWindowA);
		
		String childWindow = s.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		
		WebElement ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		if(ele.isDisplayed()) {
			System.out.println("Test case passed");
		}
		if(driver.getTitle().equals("WebDriver | Contact Us")) {; // form head : <title>WebDriver | Contact Us</title>
			System.out.println("Test case passed");
		}

		driver.switchTo().window(parentWindowA);
		driver.getCurrentUrl();
		driver.quit();
}
	
}
