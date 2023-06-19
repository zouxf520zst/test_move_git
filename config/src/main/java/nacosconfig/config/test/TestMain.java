package nacosconfig.config.test;

import nacosconfig.config.test.interf.impl.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author:zouxf
 * @date 2023/2/10 9:17
 */
public class TestMain {
    public static void main(String[] args) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
////        Persion persion = (Persion) context.getBean("persion");
////        persion.string();
//        Test test = (Test) context.getBean("test");
//        test.eat();
//        String repx ="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,24}$";
//        String regex =" ^[0-9A-Za-z]$";
//        System.out.println("2121727382".matches(repx));
//        System.out.println("37236212xzx7".matches(regex));
        String a =new String("123");
        String b ="123";
        System.out.println(a.equals(b));
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1,2,3,4,5,6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 5){

            }
        }
        Integer integer = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        }).get();
        System.out.println(integer);
//        ThreadPoolExecutor threadPoolExecutor =new ThreadPoolExecutor();
    }
}
