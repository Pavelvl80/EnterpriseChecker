package com.controller;


import com.test.TestGitApiCommands;
import com.test.TestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Edvard Piri on 26.03.2017.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public ModelAndView Test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.vm");
        return modelAndView;
    }

    @RequestMapping("/test-call")
    public ModelAndView testCall() throws Exception{
        TestUtil test = new TestUtil();
        test.test();
        return new ModelAndView("test.vm");
    }

    @RequestMapping("/test-git")
    public ModelAndView testGit() throws Exception{
        TestGitApiCommands testGit = new TestGitApiCommands();
        testGit.GitHubTest();
        return new ModelAndView("test.vm");
    }

}
