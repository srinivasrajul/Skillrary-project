package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement coursedd;
	
	public WebElement getCoursedd() {
		return coursedd;
	}
	
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getCourseTab() {
		return courseTab;		
	}
	
	public void seleniumTrainingBtn() {
		seleniumtraining.click();
	}
	
	

	

}
