package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExamOn3rdSept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
//TestCase 1  ... validate the title of the page     
		
		// getTitle() 
		
		// <title>WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)</title>
		
		String expectedTitle = "WebDriver | Dropdown Menu(s) | Checkboxe(s) | Radio Button(s)";
		
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test case 1 passed");
		}
		else {
		System.out.println("Test case 1 failed");
		}
		
//TestCase 2 Validate the heading of the page
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement heading = driver.findElement(By.cssSelector("#main-header > h1"));
			boolean b = heading.isDisplayed();
		if(b) {
			System.err.println("Test case 2 passed");
		}
		else {
			System.out.println("Test case 2 failed");
		}
		
// TestCase 3	Select all the check boxes and assert whether they are checked	
		
//		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		
//		WebElement option1 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]"));
//		WebElement option2 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
//		WebElement option3 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]]"));
//		WebElement option4 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
//		option1.click();
//		option2.click();
//		option3.click();
//		option4.click();
		
// Assertion 
//		boolean b1 = option1.isSelected();
//		boolean b2 = option2.isSelected();
//		boolean b3 = option3.isSelected();
//		boolean b4 = option4.isSelected();
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		System.out.println(b4);
		
// TestCase 4 Select orange a radio button and asset whether it is checked
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement orange = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(7)"));
		orange.click();
		boolean or = orange.isSelected();
		if(or==true) {
			System.out.println("orange radio button is selected");
		}
	
// TestCase 5 From first Drop down select python and assert		
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Select python = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		python.deselectByVisibleText("Python");
		
		String selectedOption = python.getFirstSelectedOption().getText();
		if(selectedOption.equals("Python")) {
			System.out.println("python is selected for the dropdown");
		}
		else {
			System.out.println("python is not selected form the dropsown");
		}
		
		
		
	}

}
