package runner;

import javax.swing.filechooser.FileSystemView;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/features", glue = "")
public class TestRunner {

	public static void init() {
		System.setProperty("webdriver.chrome.driver", FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "\\chromedriver.exe");
	}

}
