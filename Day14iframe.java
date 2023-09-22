package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14iframe {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// visiting the url
		driver.get("https://www.webdriveruniversity.com/IFrame/index.html");	
		
		// iframe  ------   writing test case to validate "Home"element
		
		//	WebElement ele = driver.findElement(By.cssSelector("#iframe"));
		//	driver.switchTo().frame(ele);
		
		//	Switch to iframe by index                       
		driver.switchTo().frame(0);                     
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));  // ele of Home
		System.out.println(ele2.isDisplayed());
		
		// switching back to main content
		driver.switchTo().defaultContent();
		
		// finding element in main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();
		
		// validating the title of main content
		if(driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		// closing the browser
		driver.close();
		
		//iframe // shadow DOM(Document Object Model)
		
		
	}

}
