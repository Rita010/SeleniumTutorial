package seleniumTutorialQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday1 {

	public static void main(String[] args) {
		//the path of driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		//Webdriver class
		//WebDriver is interface, ChromeDriver is class, driver is object
		ChromeDriver driver = new ChromeDriver();
		//maximini browser
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
//		//lunch browser
		//driver.get("https://www.saucedemo.com/");
		// Second method for browser
		String  url = "https://www.saucedemo.com/";
		driver.get(url);	
		
//Test case1 --> to validate login functionality by using valid username and valid pasword
		// callling function from method -->public static void login
		login(driver,"standard_user","secret_sauce" );
		boolean ab = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).isDisplayed();
		
		if(ab) 
		{
			System.out.println("Test case 1 is passed");
		}
		else
		{
			System.out.println("Test case 1 is failed");
		}
		
//Test case 2 - login functionality with invalid password 
		driver.get(url);
		login(driver,"locked_out_user","secret_sauce");
		boolean ab1 = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed();
		
		if(ab1) 
		{
			System.out.println("Test case 2 is passed");
		}
		else
		{
			System.out.println("Test case 2 is failed");
		}
// Test case 3 - to display item after login		
		
		driver.get(url);
		
		login(driver,"problem_user","secret_sauce");
		boolean ab2 = driver.findElement(By.cssSelector("#item_0_img_link > img")).isDisplayed();
		
		if(ab2) {
			System.out.println("Test case 3 Passed");
		}
		else {
			System.out.println("Test case 3 failed ");
		}
// Test case 4 -	to count number of items
		
		driver.get(url);
		login(driver,"performance_glitch_user","secret_sauce");
		int y = image(driver);
		if(y > 0 ) {
			System.out.println("Test case 4 passed");
		}
		else {
			System.out.println();
		}
	}
	public static void login(WebDriver driver,String username, String Password) {

	// to avoid writing repeatedly code : calling function for multiple user name and single password
		
		//find element by cssSelector
				driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
				//find element by xPath
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
				//find element by id
				driver.findElement(By.id("login-button")).click();	
			
	}
	public static int image(WebDriver driver) {
		int x = 0;
		List<WebElement> c = driver.findElements(By.cssSelector(".inventory_item_price"));
		c.size();// count the c's numbers
		System.out.println("Number of Image"+c.size());
		// for each loop
		for(WebElement c1: driver.findElements(By.cssSelector(".inventory_item_price"))) {
			if (c1.isDisplayed()) {
				x++;
			}
		}
			
		return x;
	}
	
}
