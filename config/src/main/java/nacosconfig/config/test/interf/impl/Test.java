package nacosconfig.config.test.interf.impl;

import nacosconfig.config.test.interf.ITest;
import org.springframework.stereotype.Component;

/**
 * @author:zouxf
 * @date 2023/2/11 16:06
 */
@Component
public class Test implements ITest {
    @Override
    public void eat() {
        System.out.println("我是test1");
    }
}
