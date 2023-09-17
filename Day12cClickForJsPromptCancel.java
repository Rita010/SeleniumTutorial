package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12cClickForJsPromptCancel {

	public static void main(String[] args) {
		
		
		// Test case 3 (CANCEL BUTTON)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// visiting the URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text2 = driver.switchTo().alert().getText();
		
		if(text2.equals("I am a JS Confirm")) {
			System.out.println("Test case for text passed");
		}
		driver.switchTo().alert().dismiss();
		System.out.println(ele.getText());
		
		if(ele.getText().equals("you clicked: Cancel")) {
			System.out.println("Test case for element text passed");
			
		}
		
		
		
		
	}

}
