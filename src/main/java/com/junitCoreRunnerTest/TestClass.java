package com.junitCoreRunnerTest;

import com.test.HomeControllerIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Edvard Piri on 07.04.2017.
 */
@RunWith(Suite.class)
public class TestClass {
    @Suite.SuiteClasses({
            HomeControllerIntegrationTest.class
    })
    public class JunitTestSuite {}
}
