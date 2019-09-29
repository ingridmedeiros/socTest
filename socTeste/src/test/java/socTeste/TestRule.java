package socTeste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {
	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) {
		if(extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}
		
		extentTest = extentReport.createTest(cenario.getId());
		
		System.setProperty("webdriver.chrome.driver", "D:/Ingrid/Estudos/chromedriver.exe");

		// Acessar base de dados
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir-C:/Users/ismed/AppData/Local/Google/Chrome/User Data");

		// Inicia o driver do Chrome e navega até a página incial
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ww2.soc.com.br/");
	}

	@After
	public static void afterCenario(Scenario cenario) {
		extentTest.log(Status.PASS, "Cenário " + cenario.getName() + " executado com sucesso!");
		extentReport.flush();
		
//		if(driver != null) {
//			driver.close();
//		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}