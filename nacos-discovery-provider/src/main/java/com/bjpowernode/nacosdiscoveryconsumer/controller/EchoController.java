package com.bjpowernode.nacosdiscoveryconsumer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bjpowernode.nacosdiscoveryconsumer.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
public class EchoController {

    @GetMapping("/")
    public ResponseEntity index() {
        log.info("provider /");
        return new ResponseEntity("index", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        log.info("provider /test");
        return new ResponseEntity("test", HttpStatus.OK);
    }

    @GetMapping("/sleep")
    public String sleep() {
        log.info("provider /sleep");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        log.info("provider /echo/{string}");
        return "hello Nacos Discovery " + string;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        log.info("provider /divide");
        return String.valueOf(a / b);
    }

    @GetMapping("/notFound")
    public String notFound() {
        System.out.println("provider 1 .........");
        return "notFound";
    }

    @GetMapping("testCache/{app}")
    public String testCache(@PathVariable("app") String app){
        return app;
    }

    @PostMapping("/multi")
    public String multi(@RequestParam("userName") String userName,@RequestParam("password") String password){
        System.out.println("===userName====:"+userName);
        System.out.println("===password====:"+password);
        return "success";
    }

    @PostMapping("/multi2")
    public String multi2(@RequestBody MultiValueMap multiValueMap){
        String userName = multiValueMap.get("userName").toString();
        String password = multiValueMap.get("password").toString();
        System.out.println("===userName====:"+userName);
        System.out.println("===password====:"+password);
        return "success";
    }
    @PostMapping("multi3")
    public String multi3(@RequestBody User user){
        System.out.println("===userName====:"+user.getUserName());
        System.out.println("===password====:"+user.getPassword());
        return "success";
    }

    @GetMapping("/testPram")
    public User testPram(@RequestParam("userName") String userName,@RequestParam("password") String password){
        System.out.println("===userName====:"+userName);
        System.out.println("===password====:"+password);
        return new User();
    }

    @PostMapping("/testPram3")
    public String testPram3(@RequestBody @Valid User user){
        System.out.println(JSONObject.toJSONString(user.getExtend()));
        if(user.getExtend().size()==0){
            System.out.println(123);
        }
        String phone = JSONObject.parseObject(JSON.toJSONString(user.getExtend())).getString("phone");
        return phone;
    }
}
