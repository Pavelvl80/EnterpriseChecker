package com.util;

import com.junitCoreRunnerTest.TestClass;
import com.test.HomeControllerIntegrationTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;

import java.util.*;

/**
 * Created by Edvard Piri on 06.04.2017.
 */
public class JUnitCoreRunner {
    public Map<String, Object> getHomeControllerIntegrationTestResult() {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(TestClass.JunitTestSuite.class);
        Integer runCount = result.getRunCount();

        Integer failedCount = result.getFailureCount();
        Integer passedCount = runCount - failedCount;

        Set<String> failedTestHeaders = new HashSet<>();
        Set<String> failedTestMessages = new HashSet<>();
        for(Failure failure : result.getFailures()) {
            failedTestHeaders.add(failure.getTestHeader());
            failedTestMessages.add(failure.getMessage());
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("runCount", runCount);
        resultMap.put("failedCount", failedCount);
        resultMap.put("passedCount", passedCount);
        resultMap.put("failedTestHeaders", failedTestHeaders);
        resultMap.put("failedTestMessages",failedTestMessages);
        //test count
        //test count passed
        //test failed
        //test failed count
        //test failed name and
        return resultMap;
    }

    public static void main(String[] args) {
        JUnitCoreRunner jUnitCoreRunner = new JUnitCoreRunner();
        jUnitCoreRunner.getHomeControllerIntegrationTestResult();
    }
}
