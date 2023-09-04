package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamOn3rdSept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
//TestCase 1  ... validate the title of the page     
		
		// getTitle() 
		
		// <title>WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)</title>
		
		String expectedTitle = "WebDriverUniversity";
		
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test case 1 passed");
		}
		else {
		System.out.println("Test case 1 failed");
		}
		
//TestCase 2 Validate the heading of the page
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement ele = driver.findElement(By.cssSelector("h1"));
			boolean b = ele.isDisplayed();
		if(b) {
			System.err.println("Test case 2 passed");
		}
		else {
			System.out.println("Test case 2 failed");
		}
		
		
	}

}
