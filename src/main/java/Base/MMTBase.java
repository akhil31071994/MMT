package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.Config;

public class MMTBase extends Config{
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Akhil\\MMTproject\\src\\main\\java\\resources\\Config.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");

		if(browser.equalsIgnoreCase(browser1)){
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			System.out.println(driver);
		}
		else{
			System.out.println("driver is not chrome");
		}
return driver;
		
	}
}
