package selenium.Proj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\path\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String actURL="https://the-internet.herokuapp.com/javascript_alerts";
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        String expURL = driver.getCurrentUrl();
        
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert a1 = driver.switchTo().alert();
        a1.accept();
        
        String Text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(Text);
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert a2 = driver.switchTo().alert();
        a2.dismiss();
        
        String Text1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(Text1);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert a3 = driver.switchTo().alert();
        Thread.sleep(2000);
        
        a3.sendKeys("Monisha");
        a3.accept();
        Thread.sleep(2000);
        
        String Text2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(Text2);
        
        
	}

}
