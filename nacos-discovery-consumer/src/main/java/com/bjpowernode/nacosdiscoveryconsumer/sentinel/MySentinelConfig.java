package com.bjpowernode.nacosdiscoveryconsumer.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author:zouxf
 * @date 2023/1/16 17:10
 */
//@Component
public class MySentinelConfig implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message","sentinel error");
        jsonObject.put("code","-1");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write(jsonObject.toJSONString());
    }
}
