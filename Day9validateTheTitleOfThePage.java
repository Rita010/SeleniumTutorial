package seleniumTutorialQ;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day9validateTheTitleOfThePage {

	public static void main(String[] args) {
		
	//	1. Surprise Test
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		
		String expectedTitle = "WebDriverUniversity.com";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test case passed");	
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		
	
		
	
		
	}

}
