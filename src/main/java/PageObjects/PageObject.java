package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	 WebDriver driver;
	 By from=By.id("fromCity");
	 By frominput=By.xpath("//input[@placeholder='From']");
	 By to=By.xpath("//input[@placeholder='To']");
	 By Date_Departure=By.id("departure");
	 
	public PageObject(WebDriver driver) {

		this.driver=driver;
	}

	public void search(String src,String dest) throws InterruptedException{
		
		Implicitwait();
		driver.findElement(from).click();
		driver.findElement(frominput).sendKeys(src);
		//Thread.sleep(4000);
		String chords=Keys.chord(Keys.DOWN,Keys.ENTER);
		driver.findElement(frominput).sendKeys(chords);
		//Thread.sleep(4000);
		System.out.println(dest);
		driver.findElement(to).sendKeys(dest);
		//Thread.sleep(3000);
		driver.findElement(to).sendKeys(chords);
		driver.findElement(Date_Departure).click();
	}
	
/*	public WebElement sourceStation(){
		return driver.findElement(from);
	}*/
	
	public Timeouts Implicitwait(){
		return driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
