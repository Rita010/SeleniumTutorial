package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12aClickForJsAlert {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		// Test Case 1
		
		// visiting the URL   
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));    
		
		// finding the element and clicking on it
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		
		// Switching to alert and getText
		String alertString = driver.switchTo().alert().getText();
		
		if(alertString.equals("I am a JS Alert")) {
			System.out.println("Test case 1 passed");
		}
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You successfully clicked an alert")){
			System.out.println("Testcase for element text passed");
		}
			
		
		
		
		
		
		
		
	}

}
