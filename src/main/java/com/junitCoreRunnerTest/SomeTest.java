package com.junitCoreRunnerTest;

import com.config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Edvard Piri on 30.03.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = AppConfig.class)
public class SomeTest {

    //simple test
    public int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void sum_test() {
        int actual = sum(10, 10);
        int expected = 20;
        Assert.assertEquals(expected, actual);
    }

}
