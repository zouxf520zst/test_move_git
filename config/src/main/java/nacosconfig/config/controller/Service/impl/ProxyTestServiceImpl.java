package nacosconfig.config.controller.Service.impl;

import nacosconfig.config.controller.Service.ProxyTestService;
import org.springframework.stereotype.Service;

/**
 * @author:zouxf
 * @date 2023/2/2 16:48
 */
@Service
public class ProxyTestServiceImpl implements ProxyTestService {
    @Override
    public String hello() {
        System.out.println("测试JDK动态代理");
        return null;
    }
}
