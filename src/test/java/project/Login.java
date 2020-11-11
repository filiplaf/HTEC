package project;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;


public class Login extends Base{
private String email = "filip.jakovlevski@gmail.com";
private String password = "f1748441";
	
	@Test
	public void homepage() throws IOException {
	driver = initializeDriver();
	driver.get("https://qa-sandbox.apps.htec.rs/");
	}

	@Test
	public void login() {
		LandingPage lp = new LandingPage(driver);
		lp.login().click();
		lp.email().sendKeys(email);
		lp.password().sendKeys(password);
		lp.sumbit().click();
		if(waitForTextToAppear(driver, "QA Sandbox", lp.title())){
			System.out.println("Success Login");
		}
		else
			System.out.println("False");
	}
}
