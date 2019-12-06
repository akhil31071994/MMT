package MMTtestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.MMTBase;
import resources.PageObject;
import resources.URLProvider;

public class click_hotel extends MMTBase {
	PageObject po;
	URLProvider urlpro;
	
	
	@BeforeMethod
	public void beforeMethodClass() throws IOException{
		driver=initializeDriver();
		po= new PageObject(driver);
		urlpro=new URLProvider();
		urlpro.getUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
	
	
	
	@Test
	public void first() throws IOException, InterruptedException{
		
		driver.get(urlpro.url);
		Thread.sleep(5000);
		po.search(srcfrom, srcto);
		
	}
	
	@AfterMethod
	public void aftermethod(){
		
		driver.quit();
	}
	
	
}