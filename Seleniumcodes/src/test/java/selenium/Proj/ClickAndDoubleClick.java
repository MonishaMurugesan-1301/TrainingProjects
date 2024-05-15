package selenium.Proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class ClickAndDoubleClick {

	public static void main(String[] args )  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://soliterata.com/testing-tool-wep-page/elements/check-box/";
		driver.get("https://soliterata.com/testing-tool-wep-page/elements/check-box/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        System.out.println("Validation successful");
		
        driver.findElement(By.linkText("Accept")).click();

        driver.get("https://soliterata.com/testing-tool-wep-page/elements/buttons/");
       
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click me']"))).click();
	        
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Wait.until(ExpectedConditions.elementToBeClickable(element));*/
        
        driver.findElement(By.xpath("//button[text()='Click me']")).click();
        
        Actions actions = new Actions(driver);
        WebElement dblclick = driver.findElement(By.xpath("//button[text()='Double-click me']"));
        
        actions.doubleClick(dblclick).perform();
        
        String Text = driver.findElement(By.xpath("//p[text()='Welcome to soliteraTA tool double clicked !!']")).getText();
        System.out.println(Text);
        
        WebElement rightclick = driver.findElement(By.xpath("//button[contains(text(),'Right-Click Me')]"));
		actions.contextClick(rightclick).perform();
        
       
	}
}
