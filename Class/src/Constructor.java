/**
 * 1.继承后-构造器的特点
 * 特点：
 *      子类构造器的第一行默认一定会先访问父类的无参数构造器
 *      再执行子类自己的构造器
 *      why?
 *      1.子类的构造器的第一行默认有一个super（）调用父类的无参数构造器，写不写都存在
 *      2.子类继承父类，子类得到父类的属性和行为
 *2.super调用父类构造器
 *      子类全部构造器默认一定会调用父类的无参数构造器
 *      super(....)根据参数选择调用父类的某个构造器
 *      this(....)借用本类其他构造器
 *      this（）和super（）必须放在构造器的第一行，---不能同时出现在构造器中
 *
 */
public class Constructor {
    public static void main(String[] args) {
        Cat1 Cat1=new Cat1("hh",10,'雄');//
        Cat1.eat();

    }
}
class Animal3{
    private String name;
    private int age;
    private char sex;
    public Animal3(){
        System.out.println("父类无参数构造器");
    }
    public Animal3(String name,int age,char sex){
        this.name=name;
        this.age=age;
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
}
class Cat1 extends Animal3{
    public Cat1(String name, int age, char sex) {
        super(name,age,sex);//根据参数匹配调用父类构造器

    }

    public void eat(){
        System.out.println(getName()+"-->"
                +getAge()+"-->"+getSex()+" 在吃");

    }
//    public Cat1(){
//        //super();//默认存在，根据参数去匹配调用父类的构造器
//        System.out.println("子类无参数构造器");
//    }
}