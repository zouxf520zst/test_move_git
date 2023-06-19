package nacosconfig.config.controller.Service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import nacosconfig.config.controller.Service.impl.ProxyTestServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:zouxf
 * @date 2023/2/2 16:51
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxyTestService proxyTestService = new ProxyTestServiceImpl();
        ProxyTestService o =(ProxyTestService) Proxy.newProxyInstance(proxyTestService.getClass().getClassLoader(), proxyTestService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("进入代理中");
                Object invoke = method.invoke(proxyTestService, args);
                System.out.println("代理结束");
                return invoke;
            }
        });
        o.hello();
    }
}
