package seleniumTutorialQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay6 {

	public static void main(String[] args) {
		
		// navigate() 
		// pageSource() 
		// driver.quit() 
		// driver.close()
		// number of ways to find element in Selenium 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
// getTitle() to obtain page title
		
		System.out.println("Page title is : "+driver.getTitle());
		String expectedTitle = "WebDriver | Contact us";
		
		WebElement head = driver.findElement(By.cssSelector("h2"));
		
// getText
		
		String s = head.getText();
		if(s.equals("CONTACT US")) {
			System.out.println("Test case 1 passed");
		}
		else {
			System.out.println("Test case 1 failed");
		}
		
// getSize() to maximize the window to get actual size
		
		driver.manage().window().maximize();
		Dimension d1 = head.getSize();
		System.out.println(d1);
		
// Arrange 	
// Action
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("rita");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("khatiwoda");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwoda50@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("#contact_form > textarea");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
// Assertion
		boolean b = driver.findElement(By.cssSelector("h1")).isDisplayed();      // h1 of thank you message
		if (b) {
			System.out.println("Test case 2 passed");
		}
		else {
			System.out.println("Test case 2 failed");
		}

// Test case 3 (incorrect email address)	
		
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
				
				
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rita");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatiwoda");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwadagmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
				

				boolean q5 = driver.findElement(By.cssSelector("body")).isDisplayed();
				
				if (q5) {
					System.out.println("Test case 3 passed");
				}
				else {
					System.out.println("Test case 3 failed");
				}
		
				
				// TesCase 4  (Reset button --- to validate that clicking reset button it shows blank string)
						
			driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
						

			driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rita");
			driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatiwoda");
			driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwada50@gmail.com");
			driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium");
			driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();    
			String q6 = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
			System.out.println(q6);
					
						if(q6.isEmpty()) {
							System.out.println("Test case 4 passed");
						}
						else {
							System.out.println("Test case 4 failed");
						}
						
// driver.navigate()
						
				driver.navigate().refresh();      // back 
				
// driver.getCurrentUrl()			
				
				String url = "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
				System.out.println("Curretn URL is:"+url);
			
// get pageSource with getText method
				
				WebElement w = driver.findElement(By.cssSelector("body"));
				String s1 = w.getText();
				System.out.println("Page source is : " + s1);
				
// from new url
				
				driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
// to find multiple elements 
				List<WebElement>links = driver.findElements(By.xpath("//*[@id=\"radio-buttons\"]"));
		
// counting no of links in result page
				
				System.out.println(links.size()+" elements");
				
				for (int i=0; i<links.size(); i++) {
					System.out.println("Radio button text: "+ links.get(i).getAttribute("value"));
				}
// to close page
				
				driver.close();
				
// to close application
				
				driver.quit();
				
				
				
				
	}

}
