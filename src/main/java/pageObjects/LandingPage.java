package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

		public WebDriver driver;
		By login = By.cssSelector("div#root a.btn.btn-lg.btn-secondary");
		By email = By.name("email");
		By password = By.name("password");
		By sumbit = By.cssSelector("div#root button[type=\"submit\"]");
		By title = By.cssSelector("div#root a > b");
		By useCases = By.cssSelector("div#root div:nth-child(2) > div > a > div > span > img");
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}

		public WebElement login() {
			return driver.findElement(login);
		}
		public WebElement email() {
			return driver.findElement(email);
		}
		public WebElement password() {
			return driver.findElement(password);
		}
		public WebElement sumbit() {
			return driver.findElement(sumbit);
		}
		public WebElement title() {
			return driver.findElement(title);
		}
		public WebElement useCases() {
			return driver.findElement(useCases);
		}
		
}
