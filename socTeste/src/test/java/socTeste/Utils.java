package socTeste;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Utils {
	public static void logPrint(String strLog) {
		ExtentTest extentTest = TestRule.getExtentTest();
		try {
			efetuarPrintTela(strLog);
			extentTest
					.log(Status.INFO, strLog,
							MediaEntityBuilder
									.createScreenCaptureFromPath(
											System.getProperty("user.dir") + "/src/test/resources" + strLog + ".png")
									.build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void efetuarPrintTela(String strLog) {
		File srcFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir") + "/src/test/resources" + strLog + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}