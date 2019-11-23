package extendDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("D:\\Report\\batch.html");
 ExtentReports report = new ExtentReports();
 
 report.attachReporter(htmlreporter);
 
 ExtentTest logger = report.createTest("Aut_01_VerifyLoginToFlightApplication","Verify user is able to login succssfully in flight");
 
 logger.log(Status.PASS, "Flight app URL is Launched");
 logger.log(Status.PASS, "Successfully enter username");
 logger.log(Status.PASS, "Successfully enter password");
 logger.log(Status.PASS, "Click on login button");
 
 report.flush();
 
	}

}
