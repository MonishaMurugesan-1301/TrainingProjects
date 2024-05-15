package selenium.Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://www.lambdatest.com/selenium-playground/drag-and-drop-demo";
		driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        
        WebElement a = driver.findElement(By.xpath("//span[text()=\"Draggable 1\"]"));
        WebElement a1 = driver.findElement(By.xpath("//span[text()=\"Draggable 2\"]"));
        WebElement a2 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        
        Actions drop = new Actions(driver);
        drop.dragAndDrop(a, a2).perform();
        drop.dragAndDrop(a1, a2).perform();
        
        String b = driver.findElement(By.xpath("//div[@id='droppedlist']")).getText();
        System.out.println(b);
        
        WebElement c = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
        drop.dragAndDropBy(c, 145, 35).build().perform();
        
        String d = driver.findElement(By.xpath("//p[text()=\"Dropped!\"]")).getText();
        System.out.println(d);
        
        
        
	}

	
}
