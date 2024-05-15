package selenium.Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Example {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://soliterata.com/testing-tool-wep-page/elements/check-box/";
		driver.get("https://soliterata.com/testing-tool-wep-page/elements/check-box/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        System.out.println("Validation successful");
        
        //driver.findElement(By.xpath("//a[@class='elementor-button elementor-button-link elementor-size-md']")).click();
        driver.findElement(By.linkText("Accept")).click();
        
        WebElement ele = driver.findElement(By.xpath("//input[@id='myCheck']"));
        ele.click();
        
        if(ele.isSelected())  {
        	System.out.println("Checkbox is selected");
        	
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
       
 	   String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
 	   System.out.println(text);
        
        }
        
        
 	}
        
	
}
			



