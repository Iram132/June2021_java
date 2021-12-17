package util;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
static WebDriver driver;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");
		return driver;
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot)driver; 
		 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		 Date date = new Date();
		 String label = formatter.format(date );
		 
		 
		 String currentDirectory = System.getProperty("user.dir");
		 FileUtils.copyFile(sourceFile,new File(currentDirectory + "/screenshot/" + label + ".png" ));}
		 
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}


}
