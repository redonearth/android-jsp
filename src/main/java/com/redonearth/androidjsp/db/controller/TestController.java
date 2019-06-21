package com.redonearth.androidjsp.db.controller;

import com.redonearth.androidjsp.db.dto.Test;
import com.redonearth.androidjsp.db.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/query")
    public @ResponseBody List<Test> query() throws Exception {
        return testService.getAll();
    }
}
