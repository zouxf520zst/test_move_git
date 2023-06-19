package nacosconfig.config.controller.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:zouxf
 * @date 2023/2/2 16:58
 */
public class ProxyTestInvocationHandler implements InvocationHandler {

    private Object object; //目标对象

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
