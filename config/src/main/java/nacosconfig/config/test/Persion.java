package nacosconfig.config.test;

/**
 * @author:zouxf
 * @date 2023/2/10 9:18
 */
public class Persion {

    private Student student;
    private String name;

    public void init(){
        System.out.println("persion类初始化中");
    }

    public Persion() {
        System.out.println("Persion类启动");
    }

    public Persion(Student student) {
        this.student = student;
    }

    public void string(){
        System.out.println(name);
        student.String();
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void destroy(){
        System.out.println("persion类消亡了");
    }
}
