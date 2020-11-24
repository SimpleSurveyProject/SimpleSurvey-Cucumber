package features;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.TestRunner;

public class ExampleTest {

	@Before
	public void init() {
		TestRunner.init();
	}

	private WebDriver driver;

	@Given("can reach website")
	public void can_reach_website() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user visits {string}")
	public void user_visits_site(String site) {
		driver.get(site);
	}

	@Then("{string} is shown")
	public void text_is_shown(String string) {
		assertThat(string, containsString(string));
	}

	@After
	public void end() {
		driver.close();
	}

}
