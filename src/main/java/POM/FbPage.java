package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPage {
	@FindBy(xpath="//Button[text()='Like']")
	private WebElement likebtn;
	
	public FbPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
	public void LikeBtn() {
		likebtn.click(); 
	}
	
	

}
