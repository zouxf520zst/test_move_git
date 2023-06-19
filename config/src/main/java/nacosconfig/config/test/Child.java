package nacosconfig.config.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Child extends Person2 {

//    private String name ="child";
    public String grade;
    public Child(){

    }

//    public Child(String grade) {
//        this.grade = grade;
//    }
    public void eating(){
        System.out.println("child...eating");
    }
    public void child(){

    }
//    public String getName(){
//        return this.name;
//    }
//    public void eat(){
//        System.out.println("child ....eat");
//    }
    public int add(int a, int b){
        try {
            return a+b;
        }catch (Exception e){
            System.out.println("异常了");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }
    public static void main(String[] args){
        new Child();
        new Person2();
        short a =1;
        System.out.println(a=(short) (a+1));
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.get(null));
        Executors.newCachedThreadPool();
//        new ThreadPoolExecutor();
//        char a = '中国';
//        System.out.println(a);
//        Float aFloat = new Float(3.01f);
//        Object[] objects = new Object[1];
//        objects[0]=aFloat;
//        aFloat=null;
//        System.out.println(objects[0]);
//        Child child = new Child();
//        System.out.println("和是:"+child.add(2, 3));
//        int i =10;
//        System.out.println(i+=i-=i*=i);
//        StringBuffer stringBuffer =new StringBuffer();
//        stringBuffer.append("1231");
//        stringBuffer.append("tqwutwu");
//        System.out.println(stringBuffer.toString());
//        stringBuffer.delete(5,9);
//        System.out.println(stringBuffer.toString());
//        child.eat();
//        child.eating();
//        System.out.println();
//        Child child1 =(Child) child;
//        System.out.println(child.getName());
//        System.out.println(child1.getName());
//        child.eat();
//        Person p = new Child();
//        p.eat();
//        System.out.println(p.grade);
//        Child child = (Child) p;
//        child.eat();
//        System.out.println("来自子类:"+child.grade);
//        System.out.println("来自父类:"+child.age);
//        System.out.println("来自父类:"+child.name);
    }

    public class Test {

        public int div(int a, int b) {

            try {

                return a / b;

            }catch(NullPointerException e){

                System.out.println("ArithmeticException");

            }

            catch (ArithmeticException e) {

                System.out.println("ArithmeticException");

            } finally {

                System.out.println("finally");

            }

            return 0;

        }
    }
}
