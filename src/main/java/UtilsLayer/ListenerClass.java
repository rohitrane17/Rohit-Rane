package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReportSetup implements ITestListener{
	
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	
	public void onStart(ITestContext context) {
		extentReport = ExtentReportSetup.extentSetup(context.getSuite().getName());
	}
	
	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test case Pass name is " + result.getMethod().getMethodName());
		
		extentTest.addScreenCaptureFromPath(ExtentReportSetup.passScreenshot(result.getMethod().getMethodName()));
	}
	
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test case Fail name is " + result.getMethod().getMethodName());
		
		extentTest.addScreenCaptureFromPath(ExtentReportSetup.passScreenshot(result.getMethod().getMethodName()));
	}
	
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test case Skipped name is " + result.getMethod().getMethodName());
	}
	
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	public void onTestFailedButWithTimeout(ITestResult result) {
		
	}
	
	
	
	

}
