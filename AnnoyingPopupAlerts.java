package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnnoyingPopupAlerts {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		// maximixing the window
		driver.manage().window().maximize();
		
		// Test case 1
		
//		// finding the locator
//		driver.findElement(By.cssSelector("#button1")).click();
//		String str = driver.switchTo().alert().getText();
//		
//		if(str.equals("I am an alert box!")) {
//			System.out.println("Test case 1 passed");
//		}
//		else {
//			System.out.println("Test case 1 failed");
//		}
		
		// Test case 2
		
//		driver.findElement(By.cssSelector("#button2 > p")).click();
//		Thread.sleep(2000);
//		String str = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).getText();
//		
//		if(str.equals("It’s that Easy!! Well I think it is.....")) {
//			System.out.println("Test case 2 Passed");
//		}
//		else {
//			System.out.println("Test case 2 failed");
//		}
		
		// Test case 3
		
//		driver.findElement(By.cssSelector("#button4 > p")).click();
//		
//		String s1 = driver.switchTo().alert().getText();
//		
//		if(s1.equals("Press a button!")) {
//			System.out.println("Test case passed");
//		}
//		else {
//			System.out.println("Test case failed");
//		}
		
		driver.switchTo().alert().accept();
		String s2 = driver.findElement(By.cssSelector("#confirm-alert-text")).getText();
		
		if(s2.equals("You pressed OK!")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
	
		}
		
		
		
	}

}
