package com.nopcommerce.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {


    public void onTestStart(ITestResult result){
        System.out.println("test "+ result.getName()+" --start executing");
}

    public void onTestFailure(ITestResult result) {
        System.out.println("test "+ result.getName()+" --start failed");
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("test "+ result.getName()+" --success");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("test "+ result.getName()+" --skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onFinish(ITestContext context) {
        System.out.println(" test finished at "+ context.getEndDate());

    }

    public void onStart(ITestContext context) {
        System.out.println("test completed at  "+ context.getStartDate());

    }

}
