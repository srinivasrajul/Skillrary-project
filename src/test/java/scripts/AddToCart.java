package scripts;

import org.testng.annotations.Test;

import POM.AddCartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPge;
import genericLib.BaseClass;

public class AddToCart extends BaseClass {
	@Test
	public void tc1() {
		
		SkillraryLoginPge s=new SkillraryLoginPge(driver);
		s.gearsbtn();
		s.skillrarydemoappbtn();
		
		utils.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utils.mouseHover(driver, d.getCourseTab());
		d.seleniumTrainingBtn();
		
		AddCartPage a=new AddCartPage(driver);
		utils.doubleClick(driver,a.getPlusbtn());
		a.AddToCart();
		
		utils.alertPoupOk(driver); 
		
		
		
		
		
		
		
		
		
		
	}
	      
	

}
