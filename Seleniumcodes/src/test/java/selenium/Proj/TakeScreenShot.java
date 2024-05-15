package selenium.Proj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	 
			static WebDriver driver;
			
			public static void takecreenshot(String fileName) throws IOException {
				//create a file with takescreenshot interface and get the screenshot as File
			
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
				
			/*TakesScreenshot ts=(TakesScreenshot)driver;
	        File file=ts.getScreenshotAs(OutputType.FILE);*/
			
				//we use copyfile method to store the file in the given path
			FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\firstproj\\ScreenShot\\" +fileName+".jpg"));
			
			}
			
			public static void main(String[] args) throws IOException {
				
				
				driver= new ChromeDriver();
				//String act= "https://jpetstore.aspectran.com/order/viewOrder?orderId=1011";
				System.setProperty("webdriver.chrome.driver",
						"\"C:\\\\Users\\\\rodara\\\\OneDrive - Capgemini\\\\Desktop\\\\Selenium_Work\\\\Sample_Project\\\\msedgedriver.exe\"");
				driver.get("https://stock.adobe.com/in/search?k=monkey&asset_id=1974128");
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        String exp= driver.getCurrentUrl();
		       // Assert.assertEquals(act, exp);
		        System.out.println("Url Validated");
		        
		         takecreenshot("Image");
		        
		 
			}
		 
		
	}


