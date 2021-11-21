package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbIcon {
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement fbbtn;
	
	public FbIcon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fb() {
		fbbtn.click();
	}

	public WebElement getFbbtn() {
		return fbbtn;
	}

	
	

}
