package com.web.side_prop.controller;


import com.web.side_prop.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = "/")
@Controller
public class testController {

    @Autowired
    private TestService testService;

    @RequestMapping(path = {""})
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(path = "/testInsert", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> testInsert(@RequestParam Map<String, Object> param) throws Exception {
        System.out.println(param.get("id"));
        System.out.println(param.get("name"));

        Map<String, Object> param1 = testService.testSvc(param);

        param1.put("msg", "success");


        return param1;
    }

}
