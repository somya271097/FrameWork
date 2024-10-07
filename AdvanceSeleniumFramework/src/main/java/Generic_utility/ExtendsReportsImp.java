package Generic_utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReportsImp implements ITestListener {
	ExtentTest test;
	ExtentReports report;

	public void onTestStart(ITestResult result) {//@Test
		test = report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		System.out.println("Script Pass");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
//		System.out.println("Script fail");

		System.out.println("----------im taking ScreenShot-----");
		String screenshot=null;
		try {
			screenshot = Webdriver_Utility.takeScreenShot1(BaseClass.sdriver, result.getMethod().getMethodName());

		} catch (Throwable e) {

			e.printStackTrace();
		}
	//	test.addScreenCaptureFromPath(screenshot);
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
		System.out.println("Script skipped");
	}

	public void onStart(ITestContext context) {
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();

		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html" + ranNum);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("VtigerReport");
		spark.config().setReportName("Somya");

		// System configuration
		report = new ExtentReports();

		report.attachReporter(spark);
		report.setSystemInfo("platform", "window10");
		report.setSystemInfo("executedBy", "Somya");
		report.setSystemInfo("Reviewed By", "Shobha");
	}

	public void onFinish(ITestContext context) {
		report.flush();

	}
}