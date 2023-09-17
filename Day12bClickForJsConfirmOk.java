package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12bClickForJsConfirmOk {

	public static void main(String[] args) {
		
		
		// Test case 2 (OK BUTTON)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// visiting the URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.equals("I am a JS Confirm")) {
			System.out.println("Test case 2 passed ");
		}
		driver.switchTo().alert().accept();
		System.out.println(ele.getText());
		
		if(ele.getText().equals("You clicked: Ok")) {
			System.out.println("Test case for element text passed");
		}
		
		
		
		
		
		
		
	}

}
