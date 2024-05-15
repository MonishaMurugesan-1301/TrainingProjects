package selenium.Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sendkeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://www.google.com/";
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        System.out.println("Validation successful");
		
        
        driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Automation");

        
        
        
        
		
	}

}
