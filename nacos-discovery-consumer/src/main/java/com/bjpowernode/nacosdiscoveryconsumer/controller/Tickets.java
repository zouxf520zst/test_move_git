package com.bjpowernode.nacosdiscoveryconsumer.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import com.bjpowernode.entity.User;
import com.bjpowernode.nacosdiscoveryconsumer.util.ThreadPoolUtil;
import org.springframework.context.ApplicationContext;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

/**
 * @author:zouxf
 * @date 2022/12/14 15:27
 */
public class Tickets extends Thread {

    static int tickets = 100;

    private static Object object = new Object();

    private ReentrantLock rLock=new ReentrantLock();

    private String name;
    public Tickets(String name){
        this.name = name;
    }
    @Override
    public void run(){
        rLock.lock();
        while (true){
                if (tickets > 0){
                    String format = String.format("%s卖出了第%s票", name,tickets--);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(format);
                }else {
                    break;
                }
        }
        rLock.unlock();
    }
}

class Test{
    public static void main(String[] args) throws IOException {
//        int i = 1;
//        Integer a =1;
//        Integer b =2;
//        System.out.println(a.compareTo(b));
//        HashMap<Object, Object> hashMap = new HashMap<>();
//        ArrayList<Integer> objects1 = new ArrayList<>();
//        objects1 =(ArrayList<Integer>) Arrays.asList(1,2,3,4);
//        objects1.add(5);
//        System.out.println(objects1.get(4));
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ArrayList<User> objects = new ArrayList<>();
//        objects.add(new User("zhangsan","123456"));
//        objects.add(new User("zhangsan","1234567"));
//        objects.add(new User("lisi","123456"));
//        objects.sort(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getUserName().equals(o2.getUserName())){
//                    return o1.getPassword().compareTo(o2.getPassword()) >= 0 ? -1:1;
//                }
//                return 0;
//            }
//        });
//        Collections.sort(objects, Comparator.comparing(User::getPassword));
//        System.out.println(objects.toString());
//        System.out.println("执行i++后的值:"+i++);
//        System.out.println("i的值:"+i);
//        int [] a ={1,2,3};
//        int [] b =new int[]{1,2,3};
//        int [] c =new int[3];
//        c[0]=1;
//        c[1]=2;
//        c[2]=3;
//        ArrayList o =new ArrayList();
//        System.out.println(a.length);
//        System.out.println("sas".length());
//        if (i == 1){
//            System.out.println(123);
//            return;
//        }
//        System.out.println(520);
//        Tickets tickets = new Tickets("机器A");
//        Tickets tickets2 = new Tickets("机器B");
//        Tickets tickets3 = new Tickets("机器C");
//        Tickets tickets4 = new Tickets("机器D");
//        tickets.start();
//        tickets2.start();
//        tickets3.start();
//        tickets4.start();
//          String a ="0:2133131,1:21212";
//          String[] m ;
//          if (a.contains(",")){
//              m = a.split(",");
//          } else {
//              m = new String[]{a};
//          }
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
//        String a ="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";
//        byte[] bytes = DatatypeConverter.parseBase64Binary(a);
//        File file = FileUtil.writeBytes(bytes, "D:/fileUpload/public/" + "534323.png");
//        if (file ==null){
//            System.out.println("文件不存在");
//        } else {
//            System.out.println("文件存在");
//        }
//        FileOutputStream outputStream = new FileOutputStream("D:/fileUpload/public/" + "6.png");
//        outputStream.write(bytes);
//        IoUtil.close(outputStream);
        for(int i=0; i < 20; i++){
            ThreadPoolUtil.executor.execute(() -> {
                System.out.println("当前线程名称"+Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                ThreadPoolUtil.executor.shutdown();
            });
        }

    }
}
