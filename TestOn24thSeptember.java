package seleniumTutorialQ;

import java.time.Duration;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestOn24thSeptember {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
		
		// click on the city input box
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click(); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	// entering "Mumbai" into the input box
		
		driver.findElement(By.cssSelector("#fromCity")).sendKeys("Mumbai");

	// finding the list of matching elements
		
		List<WebElement> dynamicList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for(int i = 0; i<dynamicList.size(); i++) {
			String FromCity = dynamicList.get(i).getText();
			System.out.println(FromCity);
			if(FromCity.contains("Mumbai")) {
				dynamicList.get(i).click();
				break;
			}
			
		}
		
	// 	to city
		driver.findElement(By.cssSelector("#toCity")).sendKeys("Kathmandu, Nepal");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		List<WebElement> dynamicList2 = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		
		for(int i = 0; i<dynamicList2.size(); i ++) {
			String toCity = dynamicList2.get(i).getText();
			System.out.println(toCity);
			if(toCity.contains("Kathmandu, Nepal")) {
				dynamicList.get(i).click();
				break;
			}
		}
		
		// booking dates
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/label/p[1]/span[1]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a")).click();
		
		
		
		driver.close();
		driver.quit();
		
		
		
	}	

}
