package Listeners_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Project.BaseClass;

public class TestListener extends BaseClass implements ITestListener {
	// public WebDriver driver;

	public void onTestStart(ITestResult result) {

		// System.out.println("onTestStart :"+result.getName());
		Reporter.log("onTestStart :" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		// System.out.println("onTestSuccess :"+result.getName());

		try {
			File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(fileSrc, new File(projectPath + "\\Screenshots\\" + filePath + ".png"));
			// Add screenshot into html file
			Reporter.log(" <a href='" + projectPath + "\\Screenshots\\" + filePath + ".png" + "'> <img src='"
					+ projectPath + "\\Screenshots\\" + filePath + ".png" + "' height='100' width='100'/>");
			Reporter.log("onTestSuccess : :" + result.getMethod().getMethodName());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestFailure(ITestResult result) {
		//System.out.println("onTestFailure :" + result.getName());
		
		try {
			File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(fileSrc, new File(projectPath + "\\FailScreenshot\\" + filePath + ".png"));
			// Add screenshot into html file
			Reporter.log(" <a href='" + projectPath + "\\FailScreenshot\\" + filePath + ".png" + "'> <img src='"
					+ projectPath + "\\FailScreenshot\\" + filePath + ".png" + "' height='100' width='100'/>");
			Reporter.log("onTestFailure : :" + result.getMethod().getMethodName());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped :" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");

	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");

	}

}
