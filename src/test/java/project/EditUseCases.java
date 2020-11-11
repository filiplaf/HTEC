package project;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CasePage;
import resources.Base;

public class EditUseCases extends Base{
private String ExpectedTitle = "Edit Use Case";
	
	@Test
	public void useCase1() {
		CasePage cp = new CasePage(driver);
		//editing Login case for switching characters
		wait_time(1);
			cp.allUseCases().get(3).click();
			Assert.assertEquals(ExpectedTitle, cp.createTitleVerification().getText());
			System.out.println("Edit login UseCase...");
			cp.titleOfTestCase().clear();
			cp.titleOfTestCase().sendKeys("This field previously had "+ TitleOfFirstTestCase.length() +" characters");
			cp.description().clear();
			cp.description().sendKeys("This field previously had "+ DesrtiptionOfFirstTestCase.length() +" characters");
			cp.expected_result().clear();
			cp.expected_result().sendKeys("This field previously had "+ ExpectedResultOfFirstTestCase.length() +" characters");
			cp.useCaseStep1().clear();
			cp.useCaseStep1().sendKeys("This field previously had "+ FirstuseCaseStep1.length() +" characters");
			cp.useCaseStep2().clear();
			cp.useCaseStep2().sendKeys("This field previously had "+ FirstuseCaseStep2.length() +" characters");
			cp.useCaseStep3().clear();
			cp.useCaseStep3().sendKeys("This field previously had "+ FirstuseCaseStep3.length() +" characters");
			cp.submitButton().click();
			System.out.println("Login page successfully edited");
		}
		
	}
