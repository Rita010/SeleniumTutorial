package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examPra2 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
// Sendkeys(); 
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
//		WebElement firstname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		firstname.sendKeys("Rita");
		
// click();
//		WebElement firstname1 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
//		WebElement lastname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
//		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
//		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
//		WebElement resetbutton = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
//		
//		firstname1.sendKeys("rita");
//		lastname.sendKeys("khatiwoda");
//		email.sendKeys("ritakhatiwoda50@gmail.com");
//		message.sendKeys("i am learning selenium");
//		resetbutton.click();

// clear()
		WebElement firstname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		firstname.sendKeys("rita");
		firstname.clear();
		
// text()    <h2 name="contactme" class="section_header">CONTACT US</h2>
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String text = heading.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
