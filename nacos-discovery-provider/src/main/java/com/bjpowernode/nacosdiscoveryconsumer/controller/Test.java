package com.bjpowernode.nacosdiscoveryconsumer.controller;


import cn.hutool.core.net.NetUtil;
import com.alibaba.fastjson.JSONObject;

/**
 * @author:zouxf
 * @date 2023/1/10 16:26
 */
public class Test {
    public static void main(String[] args) {
//        String m ="{phone:12345,ss:2131}";
//        JSONObject jsonObject = JSONObject.parseObject(m);
//        System.out.println(jsonObject.getString("phone"));
//        System.out.println(jsonObject.getString("ss"));
//        JSONObject jsonObject1 = new JSONObject();
//        jsonObject1.put("phone","hdshda");
//        System.out.println(jsonObject1.toString());
//        Integer i = 300;
//        Integer m2 = 300;
//        System.out.println(i);
//        System.out.println(i == m2);
        System.out.println(NetUtil.getLocalMacAddress());
        System.out.println("ip:"+NetUtil.getLocalhost().toString());
    }

}
