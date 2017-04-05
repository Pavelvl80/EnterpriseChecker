package com.junitCoreRunnerTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by Edvard Piri on 05.04.2017.
 */
public class JunitCoreRunnerExample {
    public Boolean jUnitTest() {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(SomeTest.class);
        result.getFailures();
        return result.wasSuccessful();
    }
}
