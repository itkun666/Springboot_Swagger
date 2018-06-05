package com.dtyunxi.swagger.demo.controller;

import com.dtyunxi.swagger.demo.pojo.Person;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("测试集成swagger")
public class Controller {
    @RequestMapping(value = "/user/{str}", method = RequestMethod.GET)
    @ApiOperation(value= "返回参数值")
    public String print(@PathVariable(name = "str") @ApiParam(value = "字符串") String str){
        return str;
    }
    @RequestMapping(value = "/user/print", method = RequestMethod.POST)
    @ApiOperation(value= "POST 对象传参")
    public String print2(@ApiParam(name = "用户") @RequestBody Person person){
        return "POST";
    }
}
