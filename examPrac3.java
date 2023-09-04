package seleniumTutorial;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class examPrac3 {

	public static void main(String[] args) {
		

		// driver.getTitle()
		// driver.navigate()
		// driver.getPageSorce()
		
	WebDriverWait wait = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url = "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
	
		
// working on navigate		
		
		driver.navigate().refresh();
		
// getCurrent url
		System.out.println("Current url: "+url);
		
		
// getPageSource()	
		
		WebElement pageSource = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String rita = pageSource.getText();
		System.out.println(rita);
		
	
// getTitle
	System.out.println("Page Title :"+driver.getTitle());
		
		
	}

}
