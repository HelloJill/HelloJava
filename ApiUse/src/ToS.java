

import java.util.Objects;

/**
 *  Object的toString方法使用
 *  包：java.lang.Object
 *  一个类要么默认继承了Object类，要么简介继承了Object类
 *  Object类的方法是一切子类都可以直接使用的
 *  常用方法：
 *      1.public String toString()
 *          默认返回当前对象在堆内存中的地址信息
 *          默认的地址信息格式：类的权限名@内存地址
 *          直接输出对象名称，默认自动调用toString()
 *          要重写,输出数据。右键->generate
 *      2.public boolean equals(Object o)
 *           默认是比较两个对象的地址是否相同，相同返回true
 *           直接比较两个对象的地址是否相同完全可以用==替代equals
 *           equals存在的意义是为了被子类重写
 *           需求：只要两个对象的内容一样，就认为相等
 *
 *
 *
 */
public class ToS {
    public static void main(String[] args) {
        Student jll=new Student("jll",21,'男');
        System.out.println(jll.toString());//api.Student@1b6d3586
        //直接输出对象名称，默认会自动调用toString
        Student zs=new Student("jll",21,'男');
        System.out.println(jll);//api.Student@1b6d3586
        System.out.println(jll.equals(zs));
        System.out.println(jll.equals(zs));

    }
}
class Student{
    private String name;
    private int age;
    private char sex;

    public Student(){

    }

    public Student(String name,int age,char sex){
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //1.判断是都自己和自己比较，如果是同一个对象比较直接返回true
        if (this == o) return true;
        //2.判断被比较者是否为空以及是否为学生类型
        if (o == null || getClass() != o.getClass()) return false;
        //3.o一定要是学生类型，强制转换成学生
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
    //@Override
    // public String toString(){
    //return "Student[name="+name+","+"age="+age+",sex="+sex+"]";

    //}
}