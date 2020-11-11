package project;

import org.testng.annotations.Test;

import pageObjects.CasePage;
import pageObjects.LandingPage;
import resources.Base;


public class EnterUseCasePage extends Base{

	@Test
	public void useCasesEnter() {
		LandingPage lp = new LandingPage(driver);
		CasePage cp = new CasePage(driver);
		lp.useCases().click();
		if(waitForTextToAppear(driver, "Use Cases", cp.titleVerification())) {
			System.out.println("You enter Use Cases page successfully");
		}
		else
			System.out.println("False");
	}

}
