package project;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CasePage;
import resources.Base;

public class CreateUseCases extends Base{
private String ExpectedTitle = "New Use Case";
	
	@Test
	public void useCase1() {
		CasePage cp = new CasePage(driver);
		cp.createUseCase().click();
		Assert.assertEquals(ExpectedTitle, cp.createTitleVerification().getText());
		cp.titleOfTestCase().sendKeys(TitleOfFirstTestCase);
		cp.description().sendKeys(DesrtiptionOfFirstTestCase);
		cp.expected_result().sendKeys(ExpectedResultOfFirstTestCase);
		cp.automatedButton().click();
		cp.useCaseStep1().sendKeys(FirstuseCaseStep1);
		cp.addStep().click();
		cp.useCaseStep2().sendKeys(FirstuseCaseStep2);
		cp.addStep().click();
		cp.useCaseStep3().sendKeys(FirstuseCaseStep3);
		cp.submitButton().click();
		wait_time(1);
		if(cp.createdUseCaseValidation().getText().equals(TitleOfFirstTestCase)) {
			System.out.println("UseCase for entering UseCase Page successfully created");
		}
		else
			System.out.println("Something went wrong");
	}
	@Test
	public void useCase2() {
		CasePage cp = new CasePage(driver);
		cp.createUseCase().click();
		Assert.assertEquals(ExpectedTitle, cp.createTitleVerification().getText());
		cp.titleOfTestCase().sendKeys(TitleOfSecondTestCase);
		cp.description().sendKeys(DesrtiptionOfSecondTestCase);
		cp.expected_result().sendKeys(ExpectedResultOfSecondTestCase);
		cp.automatedButton().click();
		cp.useCaseStep1().sendKeys(SeconduseCaseStep1);
		cp.submitButton().click();
		wait_time(1);
		if(cp.createdUseCaseValidation().getText().equals(TitleOfSecondTestCase)) {
			System.out.println("Login Use Case created successfully");
		}
		else
			System.out.println("Something went wrong");
	}
	@Test
	public void useCase3() {
		CasePage cp = new CasePage(driver);
		cp.createUseCase().click();
		Assert.assertEquals(ExpectedTitle, cp.createTitleVerification().getText());
		cp.titleOfTestCase().sendKeys(TitleOfThirdTestCase);
		cp.description().sendKeys(DesrtiptionOfThirdTestCase);
		cp.expected_result().sendKeys(ExpectedResultOfThirdTestCase);
		cp.automatedButton().click();
		cp.useCaseStep1().sendKeys(ThirduseCaseStep1);
		cp.submitButton().click();
		wait_time(1);
		if(cp.createdUseCaseValidation().getText().equals(TitleOfThirdTestCase)) {
			System.out.println("UseCase for creating successfully created");
		}
		else
			System.out.println("Something went wrong");
	}
	@Test
	public void useCase4() {
		CasePage cp = new CasePage(driver);
		cp.createUseCase().click();
		Assert.assertEquals(ExpectedTitle, cp.createTitleVerification().getText());
		cp.titleOfTestCase().sendKeys(TitleOfFourthTestCase);
		cp.description().sendKeys(DesrtiptionOfFourthTestCase);
		cp.expected_result().sendKeys(ExpectedResultOfFourthTestCase);
		cp.useCaseStep1().sendKeys(FourthuseCaseStep1);
		cp.addStep().click();
		cp.useCaseStep2().sendKeys(FourthuseCaseStep2);
		cp.addStep().click();
		cp.useCaseStep3().sendKeys(FourthuseCaseStep3);
		cp.submitButton().click();
		wait_time(1);
		if(cp.createdUseCaseValidation().getText().equals(TitleOfFourthTestCase)) {
			System.out.println("UseCase for editing successfully created");
		}
		else
			System.out.println("Something went wrong");
	}
}