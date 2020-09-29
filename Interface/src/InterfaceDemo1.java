/**
 * 接口概述：
 * 1.什么是接口
 *      更加彻底的抽象
 *      接口体现的是规范思想，实现接口的子类必须重写完接口的全部抽象方法
 * 2.接口的定义模式
 *      修饰符 interface 接口名{
 *
 *      }
 * 3.接口中成分的研究
 *      在JDK1.8之前接口中智能是抽象方法和常量
 * 4.接口的基本实现
 *      子类  继承 父类  类与类是继承关系
 *      实现类  实现  接口
 *      类与接口是实现的关系。接口是被类实现的
 *      实现接口的类称为实现类
 *      实现类的格式：
 *          修饰符 class 实现类名称  implements 接口1，接口2....{
 *
 *          }
 *          implement是类实现接口的关键字
 *          接口可以多实现
 *          一个类实现接口必须重写完接口中全部的抽象方法
 *      多实现研究：
 *          重写完全部接口中的全部抽象方法
 * 5.接口与接口的多继承
 *      类与接口是多实现关系，一个类可以同时实现多个接口
 *      接口与接口是多继承关系，一个接口可以同时继承多个接口
 * 6.JDK1.8开始之后新增的三个方法：
 *      1.默认方法：实例方法
 *          必须用default修饰
 *          默认会加public修饰
 *          用接口的实现类的对象来调用
 *      2.静态方法
 *          可以直接加static修饰
 *          默认会加public修饰
 *          用接口的类名称调用
 *      3.私有方法1.9开始
 *          私有的实例方法
 *          private修饰
 *          给私有方法或者默认方法调用，只能在本接口中调用
 *
 *
 *
 */
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Pingpong zjk=new Pingpong("张继科");
        zjk.rule();
        zjk.run();
        zjk.competition();
    }
}
//实现类实现接口
class Pingpong implements SpotrMan,Law{
    private String name;
    public Pingpong(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"乒乓跑");

    }

    @Override
    public void competition() {
        System.out.println(name+"乒乓比赛");

    }

    @Override
    public void rule() {
        System.out.println("rule");
    }
}

interface SpotrMan{
    void run();
    void competition();

}

interface Law{
    void rule();
}