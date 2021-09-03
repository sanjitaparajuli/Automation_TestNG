package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
static WebDriver driver;
	
	public static  WebDriver initDriver() {
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://techfios.com/test/101/index.php");
	return driver;
	
	}


}
