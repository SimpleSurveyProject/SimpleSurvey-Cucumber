package features;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.TestRunner;

public class ExampleTest {

	@Before
	public static void init() {
		TestRunner.init();
	}

	@Given("can reach website")
	public void can_reach_website() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user visits site")
	public void user_visits_site() {
//		throw new io.cucumber.java.PendingException();
	}

	@Then("hello-world is shown")
	public void hello_world_is_shown() {
//		throw new io.cucumber.java.PendingException();
	}

	@And("browser will closed")
	public void browserWillClosed() throws Throwable {
		
	}

}
