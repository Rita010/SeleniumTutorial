package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examPrac1 {

	public static void main(String[] args) {

		//Arrangement
		//Action
		//Assertion - validation for an application. it is use to compare the actual result of 
		//        				an application with the expected result.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url = "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
		
// TestCase 1 - entering valid credentials
		WebElement firstname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		firstname.sendKeys("Rita");
		lastname.sendKeys("Khatiwoda");
		email.sendKeys("ritakhatiwada50@gmail.com");
		message.sendKeys("I am learing Selenium");
		submit.click();
		
		WebElement head = driver.findElement(By.cssSelector("#contact_reply > h1"));
		boolean a = head.isDisplayed();
		if (a) {
			System.out.println("Test Case 1 Passed");
		}
		else {
			System.out.println("Test Case 1 Failed");
		}
// TestCase 2 - displayed error message by entering wrong email id
		 
		driver.get(url);
		WebElement firstname2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message2 = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit2 = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		firstname2.sendKeys("Rita");
		lastname2.sendKeys("Khatiwoda");
		email2.sendKeys("ritakhatiwada50gmail.com");
		message2.sendKeys("I am learing Selenium");
		submit2.click();
		
		WebElement head2 = driver.findElement(By.cssSelector("body"));
		boolean b = head2.isDisplayed();
		if (b) {
			System.out.println("Testcase 2 passed");
		}
		else {
			System.out.println("Testcase 2 failed");
		}
// TestCase 3	 -- reset button	
		driver.get(url);
		
		WebElement firstname3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message3 = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		firstname3.sendKeys("Rita");
		lastname3.sendKeys("Khatiwoda");
		email3.sendKeys("ritakhatiwada50@gmail.com");
		message3.sendKeys("I am learing Selenium");
		reset.click();
		
		String r = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
		System.out.println(r);
		if (r.isEmpty()) {
			System.out.println("Testcase 3 Passed");
		}
		else {
			System.out.println("Testcase 3 Failed");
		}
		
		
		
		
	}

}
