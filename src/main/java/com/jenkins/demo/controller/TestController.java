package com.jenkins.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(value = "测试控制器",tags = "测试控制器")
public class TestController {

    @ApiOperation(value = "返回字符串",notes = "返回字符串")
    @GetMapping("/str")
    public  String test(){
        return "success";
    }
}
