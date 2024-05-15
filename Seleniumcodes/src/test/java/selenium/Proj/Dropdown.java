package selenium.Proj;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        
        Select select = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div']/p/select")));
        
       // select.selectByValue("IRQ");
       //select.selectByIndex(4);
       // select.selectByVisibleText("India");
        
        List <WebElement> options = select.getOptions();
        
        System.out.println("size is: " + options.size());
        
        for(WebElement element : options) {
        	System.out.println(element.getText());
        	
        if(element.getText().equals("India")) {
        	element.click();
        	break;
        }
        }
        
      
        

	}

}
