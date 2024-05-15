package selenium.Proj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://demo.automationtesting.in/Windows.html";
		driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        
       
       System.out.println("Validation successful");
       WebElement SepWindow= driver.findElement(By.partialLinkText("Seperate Windows"));// New Seperate Windows
	   SepWindow.click();
	   WebElement open= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	   open.click();
	   String Parent_w = driver.getWindowHandle();
	   Set <String> set = driver.getWindowHandles();
	   Iterator <String> I = set.iterator();
	   while(I.hasNext()){
		  String Child_w = I.next();
		  if(!(Parent_w.equals(Child_w))) {
			  driver.switchTo().window(Child_w);
		  }
	  }
	  System.out.println(driver.getTitle());
	  driver.switchTo().window(Parent_w);
	}
 


}
