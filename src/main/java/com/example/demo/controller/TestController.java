package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Api(value = "接口业务部分")
@RestController
@RequestMapping(value = "/api")
public class TestController {

    @ApiOperation(value = "获取用户详细信息", notes = "根据id来获取用户详细信息")
    @RequestMapping(value = "/get-info", method = RequestMethod.GET)
    @ApiImplicitParam(name = "params" ,value = "输入参数",required = true,dataType = "String")
    public Object getData(@RequestParam(value = "params", required = false, defaultValue = "测试") String params) {

        Map<Integer, String> data = new HashMap<Integer, String>();

        data.put(new Random().nextInt(), "dsd");
        data.put(new Random().nextInt(), params);
        return data;
    }
}
