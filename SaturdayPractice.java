package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaturdayPractice {

	public static void main(String[] args) {
		//the path of driver(Key, Value)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		
		//WebDriver is interface, ChromeDriver is class, driver is object
		WebDriver driver = new ChromeDriver();
		//maxi & mini browser
	//	driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
//		//lunch browser
		//driver.get("https://www.saucedemo.com/");
		
		// Second method for browser
		String  url = "https://www.saucedemo.com/";
		driver.get(url);// to call multiple times 
		
//		//find element by cssSelector
//		WebElement username = driver.findElement(By.cssSelector("#user-name"));
//		//find element by xPath
//		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		//find element by id
//		WebElement Login = driver.findElement(By.id("login-button"));
//		
//		//Sending values
//		username.sendKeys("standard_user");
//		Password.sendKeys("secret_sauce");
//		Login.click();
//		
		//****OR ***short method
		// close//find element by cssSelector
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//find element by xPath
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		//find element by id
		driver.findElement(By.id("login-button")).click();	
	
		//driver.close();
	
		
	}
}
