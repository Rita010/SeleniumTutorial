package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12fModelPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.cssSelector("#button2 > p")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean b1 = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).isDisplayed();
		if(b1){
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		driver.findElement(By.cssSelector("#myModal > div > div > div.modal-footer > button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		boolean b2 = driver.findElement(By.cssSelector("#myModal > div > div > div.modal-header > h4")).isDisplayed();
		if(b2==false) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		driver.close();
		
		
	}

}
