package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private Environment environment;

    @RequestMapping("/")
    ModelAndView index(){
        String version = environment.getProperty("APP_VERSION");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("appVersion", version);
        return modelAndView;
    }
}
