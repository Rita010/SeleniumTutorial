package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12dClickForJsPromptOk {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Test case 4 (OK BUTTON)
		
		
		// visiting the URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.equals("I am a JS prompt")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		driver.switchTo().alert().sendKeys("Text");
		driver.switchTo().alert().accept();
		
		if(ele.getText().equals("You entered: Text")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		

	}

}
