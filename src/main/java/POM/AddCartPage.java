package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddCartPage {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusbtn;
	
	@FindBy(xpath="//Button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void PlusBtn() {
		plusbtn.click();
	}
	public WebElement getPlusbtn1() {
		return plusbtn;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public void AddToCart() {
		addtocart.click();
	}
	public WebElement getPlusbtn() {
		// TODO Auto-generated method stub
		return plusbtn;
	}
	
	
	
			

}
