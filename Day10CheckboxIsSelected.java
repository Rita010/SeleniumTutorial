package seleniumTutorialQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10CheckboxIsSelected {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritak\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox'"));
	  
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
               
            }
            else {
             checkbox.isSelected();
            }
            
            System.out.println(checkbox.isSelected()); 
        }
        
		
		
        }	
		
		
		
	}


