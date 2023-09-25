package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12JavaScriptAlerts {

	public static void main(String[] args) {

	// Test case 1
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	// visiting the Url	
				
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele = driver.findElement(By.id("result"));
		
//	// finding the element by clicking on it
//		
//		   driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
//		
//	// switching to alert and getText
//		   
//		String alertString = driver.switchTo().alert().getText();
//		if(alertString.equals("I am a JS Alert")) {
//			System.out.println("Test case 1 for text passed");
//		}
//		driver.switchTo().alert().accept();
//		if(ele.getText().equals("You successfully clicked an alert"));
//		System.out.println("Test case for element text passed");
		
		
	// TestCase 2
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		String text1 = driver.switchTo().alert().getText();
//		if(text1.equals("I am a JS Confirm")) {
//			System.out.println("Test case 2 for text passed");
//		}
//		driver.switchTo().alert().accept();
//		System.out.println(ele.getText());
//		if(ele.getText().equals("You clicked: Ok"));
//		System.out.println("Test case for element text passed");
		
	// Test case 3
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
//		String text2 = driver.switchTo().alert().getText();
//		if(text2.equals("I am a JS Confirm")) {
//			System.out.println("Test case for text passed");
//		}
//		driver.switchTo().alert().dismiss();
//		System.out.println(ele.getText());
//		if(ele.getText().equals("You clicked: Cancel")) {
//			System.out.println("Test case for element text passed");
//		}
		
		
	// Test case 4
		
//		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		String text = driver.switchTo().alert().getText();
//		if(text.equals("I am a JS prompt")) {
//			System.out.println("Test case for text passed");
//		}
//		else {
//			System.out.println("Test case failed");
//		}
//		driver.switchTo().alert().sendKeys("text");
//		driver.switchTo().alert().accept();
//		if(ele.getText().equals("You entered: text")) {
//			System.out.println("Test case passed");
//		}
//		else {
//			System.out.println("Test case failed");
//		}
		
	// Test case 5
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.equals("I am a JS prompt")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.switchTo().alert().sendKeys("text");
		driver.switchTo().alert().dismiss();
		
		if(ele.getText().equals("You entered: null")) {
			System.out.println("Test case pass");
		}
		else { 
			System.out.println("Test case fail");
		}
		
		driver.close();
		driver.quit();

	}

}
