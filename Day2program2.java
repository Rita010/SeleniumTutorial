package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2program2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		
		// is displayed method()
		// B1 ----- true
		
		
		WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
		
		
		boolean B1 = heading.isDisplayed();
		System.out.println(B1);
		
		
		// is_enabled method()
		// B2 ----- true
		
		
		WebElement lettuceRB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		
		boolean B2 = lettuceRB.isEnabled();
		System.out.println(B2);
	
		
		// B3 ----- true
		
		WebElement pumpkinRB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
																				
		boolean B3 = pumpkinRB.isEnabled();
		System.out.println(B3);
		
		
		// B4 ------ false
		
		
		WebElement cabbageRB = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		
		boolean B4 = cabbageRB.isEnabled();
		System.out.println(B4);
		
		
		// B5 ----- true
		
		// is selected method()
		// to check if the object is selected or not (pumpkinRBsc: pumpkinRadioButtonSelected).... if pumpkin is selected answer will be true
		
		WebElement pumpkinRBsc = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean B5 = pumpkinRBsc.isSelected();					
		System.out.println(B5);
		
		
		// submit ()
		
		
	
	        
	
	}

}
