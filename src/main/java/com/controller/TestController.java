package com.controller;


import com.junitCoreRunnerTest.JunitCoreRunnerExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Edvard Piri on 26.03.2017.
 */
@Controller
public class TestController {

    @RequestMapping("/com/test")
    public ModelAndView Test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.vm");
        return modelAndView;
    }

    @RequestMapping("/junit-com.test")
    public ModelAndView JUnitTest() {
        JunitCoreRunnerExample runner = new JunitCoreRunnerExample();
        runner.jUnitTest();
        return new ModelAndView("test.vm");
    }
}
