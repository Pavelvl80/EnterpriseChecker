package com.controller;

import com.google.gson.Gson;
import com.util.JUnitCoreRunner;
import org.junit.runner.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Edvard Piri on 06.04.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("index.vm");
    }

    @RequestMapping("/result-of-test")
    public String resultsOfTest(@RequestParam String someVar) {
        JUnitCoreRunner runner = new JUnitCoreRunner();
        Map<String, Object> testResult = runner.getHomeControllerIntegrationTestResult();
        String jsoneResult = new Gson().toJson(testResult);
        return jsoneResult;
    }
}
