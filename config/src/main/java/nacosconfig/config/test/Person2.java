package nacosconfig.config.test;

public class Person2 {

    private String name="Person2";

    public String getName(){
        return this.name;
    }

    private int age=0;

    public int age2 = 10;

    public Person2() {
        System.out.println("persion");
    }

    private Person2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+"...."+age);
    }
    protected void eating(){
        System.out.println("eating");
    }
    public void eat(){
        System.out.println("person ......eat");
    }

    protected void test(){
        System.out.println("test");
    }

//    default void te(){
//        System.out.println("default");
//    }
}


