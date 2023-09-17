package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12eClickForJsPromptCancel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		// Test case 5 (CANCEL BUTTON)
		
		
		// visiting the URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));

		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text = driver.switchTo().alert().getText();
		if(text.equals("I am a JS prompt")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().dismiss();
		
		if(ele.getText().equals("You entered: null")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		
	}

}
