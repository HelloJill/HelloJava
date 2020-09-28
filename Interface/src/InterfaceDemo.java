package interfacestudy;

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
 *
 *
 *
 *
 */
public interface InterfaceDemo {
    //1.抽象方法,可以省略public abstract
    //public abstract void run();
    void run();
    //2.常量，变量值只有一个，运行过程中不可更改  public static final
    //public static final String SCHOOL_NAME="tj";
    String SCHOOL_NAME="tj";

}
