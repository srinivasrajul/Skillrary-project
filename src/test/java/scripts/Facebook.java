package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.FbIcon;
import POM.FbPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPge;
import genericLib.BaseClass;

public class Facebook extends BaseClass {
	// @Parameters ({"browserName"})
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPge s=new SkillraryLoginPge(driver);
		s.gearsbtn();
		s.skillrarydemoappbtn();
		
	    utils.switchTabs(driver);
	    
	    SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
	    utils.dropDown(d.getCoursedd(),pdata.getPropertyData("coursedd"));
	    
	    
	    
	    FbIcon f=new FbIcon(driver);
	    WebElement fbb = f.getFbbtn();
	    Point loc = fbb.getLocation();
	    int x = loc.getX();
	    int y=loc.getY();
	    utils.scrollBar(driver, x, y);
	    fbb.click();
	    
	    //Thread.sleep(2000);
	    
	    FbPage fbp = new FbPage(driver);
	    fbp.LikeBtn();
			
		}
		
		
	}
	


