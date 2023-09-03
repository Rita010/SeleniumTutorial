package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examPrac2 {

	public static void main(String[] args) {
		
		System.setProperty("ChromeDriver.Driver.Driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url = "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
		
//Test case 1 ---- entering valid credentials
		
		WebElement firstname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		firstname.sendKeys("Rita");
		lastname.sendKeys("Khatiwoda");
		email.sendKeys("ritakhatiwada50@gamil.com");
		message.sendKeys("Learning Selenium");
		submit.click();
		
		boolean a = driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
		if (a) {
			System.out.println("Test case 1 passed ");
		}
		else {
			System.out.println("Test case 1 failed ");
		}
		
// Test case 2 - invalid email id		
		
		driver.get(url);
		
		WebElement firstname2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email2 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message2 = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submit2 = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		firstname2.sendKeys("Rita");
		lastname2.sendKeys("Khatiwoda");
		email2.sendKeys("ritakhatiwada50gamil.com");
		message2.sendKeys("Learning Selenium");
		submit2.click();
		
		boolean b = driver.findElement(By.cssSelector("body")).isDisplayed();
		if (b) {
			System.out.println("Test case 2 passed");
		}
		else {
			System.out.println("Test case 2 failed");
		}
// Test case 3 - fields are empty after clicking reset button	
		
		driver.get(url);
		
		WebElement firstname3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastname3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email3 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message3 = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		firstname3.sendKeys("Rita");
		lastname3.sendKeys("Khatiwoda");
		email3.sendKeys("ritakhatiwada50@gamil.com");
		message3.sendKeys("Learning Selenium");
		reset.click();
		
		String s3 = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
		System.out.println(s3);
		if (s3.isEmpty()) {
			System.out.println("Test case 3 passed");
		}
		else {
			System.out.println("Test case 3 failed");
		}
		
// to close page
		
	//	driver.close();
		
//to close application
		
	//	driver.quit();
		
		
				
				// driver.close()			= done
				// driver.quit()			= done
				// driver.getTitle()
				// driver.getCurrentUrl()	= done
				// driver.navigate()
				// driver.getPageSorce()
				// driver.findElement()		= done
				// driver.findElements()	= done

		
		
		
		
	}

}
