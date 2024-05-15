package selenium.Proj;


import java.util.List;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ClickingMultipleCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://www.sparkstone.co.nz/sampleapp/101/app.php";
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/app.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        System.out.println("Validation successful");
        
        driver.findElement(By.xpath("//button[@name ='Next (Enter Insurant Data)']")).click();
        
        
        List <WebElement> list = driver.findElements(By.xpath("(//p[@class='group'])[position()=3]/label"));
        for (WebElement a : list) {
        	if(!(a.isSelected())) {
        		a.click();
        		
        	}
			
		}
	}

}
