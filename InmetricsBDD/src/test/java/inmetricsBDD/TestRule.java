package inmetricsBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule{
	
	private static WebDriver driver;
	
	@Before
	public void beforescenario() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.inmrobo.tk/accounts/login/");
	}
	
	@After
	public void afterscenario() {
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}