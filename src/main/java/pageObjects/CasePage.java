package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasePage {

		public WebDriver driver;
		By titleVerification = By.cssSelector("div#root span > b");
		By createUseCase = By.cssSelector("div#root a.btn.mb-4.btn-primary.float-right");
		By createTitleVerification = By.cssSelector("div#root span > b");
		By titleOfTestCase = By.name("title");
		By description = By.name("description");
		By expected_result = By.name("expected_result");
		By automatedButton = By.cssSelector("div#root label");
		By addStep = By.cssSelector("div#root div.rowFullWidth.row.addButton > button > span");
		By useCaseStep1 = By.name("testStepId-0");
		By useCaseStep2 = By.name("testStepId-1");
		By useCaseStep3 = By.name("testStepId-2");
		By submitButton = By.cssSelector("div#root button[type=\"submit\"]");
		By createdUseCaseValidation = By.cssSelector("div#root div.container > div > div > a");
		By allUseCases = By.cssSelector("div#root div.container > div > div > a");
		
		public CasePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		public WebElement titleVerification() {
			return driver.findElement(titleVerification);
		}
		public WebElement createUseCase() {
			return driver.findElement(createUseCase);
		}
		public WebElement createTitleVerification() {
			return driver.findElement(createTitleVerification);
		}
		public WebElement titleOfTestCase() {
			return driver.findElement(titleOfTestCase);
		}
		public WebElement description() {
			return driver.findElement(description);
		}
		public WebElement addStep() {
			return driver.findElement(addStep);
		}
		public WebElement expected_result() {
			return driver.findElement(expected_result);
		}
		public WebElement automatedButton() {
			return driver.findElement(automatedButton);
		}
		public WebElement useCaseStep1() {
			return driver.findElement(useCaseStep1);
		}
		public WebElement useCaseStep2() {
			return driver.findElement(useCaseStep2);
		}
		public WebElement useCaseStep3() {
			return driver.findElement(useCaseStep3);
		}
		public WebElement submitButton() {
			return driver.findElement(submitButton);
		}
		public WebElement createdUseCaseValidation() {
			return driver.findElement(createdUseCaseValidation);
		}
		public List<WebElement> allUseCases() {
			return driver.findElements(allUseCases);
		}
}
