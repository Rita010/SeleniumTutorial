package seleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examPrac4 {

	public static void main(String[] args) {
		
		System.setProperty("cromedriver.driver.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		String url = "https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"; 
		driver.get(url);
		
		List<WebElement> el = driver.findElements(By.cssSelector("#radio-buttons"));
		System.out.println(el.size());
		
		
		// for loop
		for(int i = 0; i<el.size();i++) {
			System.out.println("radio Buttons text: "+el.get(i).getAttribute("value"));
		}
		
	}

}
