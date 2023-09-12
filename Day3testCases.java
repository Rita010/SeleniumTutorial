package seleniumTutorialQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3testCases {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	
//Arrange(arrangement)
	driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
// Test case 1
	
	// <h2 name="contactme" id = "three" class="section_header">CONTACT US</h2> (for reference only)
	// 2 ways to find web element = Xpath , CSS selector 
	
	// tagName
	
	// finding element with tagName to find "CONTACT US" element
	// {in DOM ctrl+f and type = tagName that is highlighted}
	
	WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String q1 = headTwo.getText();
		System.out.println(q1);  // CONTACT US
		
		
	// class
		
	// finding element with class to find the "CONTACT US" text element
	// {in DOM ctrl+f and type = .value of that attribute*}
		
	WebElement headTwoB =driver.findElement(By.cssSelector(".section_header"));	
		String q2 = headTwoB.getText();
		System.out.println(q2); //  CONTACT US
		
	// id
		
	// finding element with id to validate that "CONTACT US"  complete form is displayed
	// {in Dom ctrl+f and type = [id]
	
	//<form action="contact_us.php" method="post" id="contact_form"> (for reference only)
  
	WebElement headTwoC = driver.findElement(By.cssSelector("#contact_form"));
		boolean pre = headTwoC.isDisplayed();
		System.out.println(pre);   // true
	

	
	// anyAttribute
	
	// finding element by any attribute
	// tagName[attribute ="value"]
		
	WebElement headThreeD = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		String q3 = headThreeD.getText();
		System.out.println(q3);  // CONTACT US
		
		if(q3.equals("CONTACT US")) {
			System.out.println("Test case 1 passed");
		}
		else {
			System.out.println("Test case 1 failed");
		}
		
// Test casse 2 (happy path)           (to validate thank you message is displayed)
		
		
		//Arrange 
		//Action 
		//Assertion
		
		
		//Arrange 
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rita");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatiwoda");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwada50@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("Hello Selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		
		//Assertion  (element is present or not)
		
		boolean q4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
		
		if (q4) {
			System.out.println("Test case 2 passed");
		}
		else {
			System.out.println("Test case 2 failed");
		}

// Test case 3 (incorrect email address)	
		
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rita");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Khatiwoda");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("ritakhatiwada50gmail.com");
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
		
		
		
	}

}
