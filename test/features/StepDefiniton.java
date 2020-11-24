package features;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.util.concurrent.TimeUnit;

import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniton {

	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;

	@Given("can reach website")
	public void can_reach_website() {
		System.setProperty("webdriver.chrome.driver", FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
	}

	@When("user visits {string}")
	public void user_visits_site(String site) {
		driver.get(site);
	}

	@Then("{string} is shown")
	public void text_is_shown(String string) {
		assertThat(string, containsString(string));
	}

	@Then("close site")
	public void close_site() {
		driver.close();
	}

	@Then("click {string}")
	public void click(String string) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait.until(presenceOfElementLocated(By.xpath(string)));
		
		WebElement element = driver.findElement(By.xpath(string));
		actions.moveToElement(element).perform();
		actions.moveToElement(element).click().perform();
	}

	@Then("fill {string} {string}")
	public void fill(String xpath, String content) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait.until(presenceOfElementLocated(By.xpath(xpath)));
		
		driver.findElement(By.xpath(xpath)).sendKeys(content);
	}

}
