package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	
	public void dropDown(WebElement ele,String text) {
		Select s =new Select(ele);
		s.selectByVisibleText(text);
	}
		
	public void mouseHover(WebDriver driver,WebElement ele1) {
			Actions a=new Actions(driver);
			a.moveToElement(ele1).perform();	
	}

	public void doubleClick(WebDriver driver,WebElement object) {
		Actions a= new Actions(driver);
		a.doubleClick(object).perform();
	}
	
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertPoupOk(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void alertPopupCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();	
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> child=driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	public void scrollBar(WebDriver driver ,int x,int y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ("+x+","+y+")");
		}
		
		
		
	}


