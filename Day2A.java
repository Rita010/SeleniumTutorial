package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2A {

	public static void main(String[] args) {
		
		// WebElement methods 
		   
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// program 1
		
		
		// sendKeys();
		
		
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
//		WebElement first_name = dr.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		
//		first_name.sendKeys("Rita");
		
		 
		// click   (Find elements)
		
		
		WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset_button = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		// Writing on it 
		
		first_name.sendKeys("Rita");
		last_name.sendKeys("Khatiwoda");
		email_address.sendKeys("ritakhatiwoda50@gmail.com");
		message.sendKeys("I am learning Selenium");
		
		// 	click button
		//	reset_button.click();
		
		// clear method():
		

		WebElement first_name1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		//		first_name.sendKeys("Rita");
		// 		firstName.clear	
		
		
		
		// getText method()
		
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		String text = heading.getText();
		System.out.println(text);
		
		
		
	}

}
