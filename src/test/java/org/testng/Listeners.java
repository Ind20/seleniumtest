package org.testng;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("executed on test start");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("executed on Success of test cases");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("executed on Failure of test cases" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("executed on Skip of test cases ");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        System.out.println("Failure of test cases");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("execute on start");

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("execute on finish");

    }
}