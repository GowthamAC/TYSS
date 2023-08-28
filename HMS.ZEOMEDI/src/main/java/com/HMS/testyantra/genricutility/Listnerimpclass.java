 package com.HMS.testyantra.genricutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listnerimpclass implements ITestListener {
	ExtentReports report;
	ExtentTest test ;
	public void onTestStart(ITestResult result) {
     //script starts from here
		String methodname = result.getMethod().getMethodName();
		test = report.createTest(methodname);
		Reporter.log(methodname+"  ---> script execution starts");
	}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"----> passed"); 
		Reporter.log(methodname+"----> testscript execution sucess");
	}

	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		System.out.println("----i am listning----");
		
		TakesScreenshot takesscreanshot=(TakesScreenshot) Baseclass.driver;
		File src = takesscreanshot.getScreenshotAs(OutputType.FILE);
		String datetime = LocalDateTime.now().toString().replace(" ", "-").replace(":", "-");
		File dest = new File("screanshots/"+" "+testname+" "+datetime+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		}
	}
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"  --->skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log("Testscript execution  ");
	}
 
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(".Extentreport/report.html");
		htmlreport.config().setDocumentTitle("SDET-48 batch");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Vtiger");
		
		//Like pre condition
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base_Browser", "Chrome");
		report.setSystemInfo("OS", "windows");
		report.setSystemInfo("Base_url", "http://Localhost:8888");
		report.setSystemInfo("Reporter_name", "Kantha");
	}

	public void onFinish(ITestContext context) {
	  //Consolidate the report
		report.flush();
	}
}
