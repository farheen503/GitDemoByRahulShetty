package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	@BeforeClass
	public WebDriver setUp() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\FARHEESH\\OneDrive - Capgemini\\Documents\\TestNGPractice\\sauceDemoLogin\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(fis);
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
		
	}
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
