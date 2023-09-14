package seleniumTutorialQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10RadioButtonIsSelected {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		 // Find all radio buttons with type="radio"
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));

        
        for (WebElement radioButton : radioButtons) {
            radioButton.click();
           
            boolean isSelected = radioButton.isSelected();
            System.out.println(isSelected);
        }

		
		
		
		
		

	}

}
