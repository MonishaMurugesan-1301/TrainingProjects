package selenium.Proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRealProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		/*System.setProperty("webdriver.chrome driver", "path");
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("link");
		driver.manage().window().maximize();*/
		}

}
