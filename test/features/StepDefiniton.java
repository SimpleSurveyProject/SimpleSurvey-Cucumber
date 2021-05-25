package features;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.concurrent.TimeUnit;

import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniton {

	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;

	@Given("browser open")
	public void can_reach_website() {
		System.setProperty("webdriver.chrome.driver", FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 30);
	}

	@Given("user logged in")
	public void user_logged_in() {
		user_visits_site("http://simplesurvey.de/");
		click("Login");
		fill("//*[@id=\"mat-input-0\"]", "testaccount");
		fill("//*[@id=\"mat-input-1\"]", "testpassword");
		click("Submit");
		text_is_shown("Dashboard");
	}

	@When("user visits {string}")
	public void user_visits_site(String site) {
		driver.get(site);
	}

	@Then("{string} is shown")
	public void text_is_shown(String string) {
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return driver.getPageSource().contains(string);
			}
		});
	}

	@Then("click {string}")
	public void click(String text) {
		By by = By.xpath("//span[contains(., '" + text + "')]");

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(presenceOfElementLocated(by));

		WebElement element = driver.findElement(by);
		actions.moveToElement(element).perform();
		actions.moveToElement(element).click().perform();
	}

	@Then("click xpath {string}")
	public void click_xpath(String xpath) {
		By by = By.xpath(xpath);

		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(presenceOfElementLocated(by));

		WebElement element = driver.findElement(by);
		actions.moveToElement(element).perform();
		actions.moveToElement(element).click().perform();
	}

	@Then("wait {int} seconds")
	public void wait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("fill {string} {string}")
	public void fill(String xpath, String content) {
		By by = By.xpath(xpath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(presenceOfElementLocated(by));

		driver.findElement(by).sendKeys(content);
	}

	@After()
	public void closeBrowser() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
