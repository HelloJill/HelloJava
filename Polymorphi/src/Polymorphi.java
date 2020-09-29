

import javax.swing.*;

/**
 * 多态概述
 * 1.多态的形式
 *      父类类型 对象名称=new 子类构造器；
 *      接口 对象名称= new 实现类构造器；
 *
 *      杜磊类型范围>子类类型范围
 * 2.概念
 *      同一个类型的对象，执行同一个行为，在不同状态下会表现出不同的行为特征
 * 3.多态的识别：
 *      对于方法的调用：编译看左边，执行看右边
 *      对于变量的调用，编译看左边，运行看左边
 *  4.多态的使用前提
 *      （1） 必须存在继承或者实现的关系
 *      （2） 必须存在父类类型的变量引用子类类型的对象
 *      （3） 需要存在方法重写
 *  5.多态的优势
 *      1.在多态形式下，右边对象可以实现组件化切换，业务功能也随之改变，便于
 *          扩展和维护。可以实现类与类之间的解耦
 *      2.实际开发的过程中，父类类型作为方法形式参数，传递
 *      子类对象给方法。可以传入一切子类对象进行方法的调用，体现出福哦太的扩展性
 *      与便利
 *  6.多态的劣势
 *      1.多态形式下，不能直接调用子类特有的功能，编译看左边
 *
 *  7.多态下——引用类型的强制类型转换
 *      格式：
 *          类型 变量名称=（类型）（对象或者变量）
 *     多态下类型转换异常问题研究（重点）
 *     注意：  有继承/实现关系的两个类型就可以进行强制转换，编译阶段不报错
 *            但是运行阶段可能出现类型转换异常classcastexception
 *     建议强制转换之前先判断变量的真实类型再强制转换！
 *     变量instanceof 类型：判断前面的变量是否是后边类型或者其子类类型
 *
 */
public class Polymorphi {
    public static void main(String[] args) {
        //父类类型 对象名称=new 子类构造器；
        Animal dlam=new Cat();
        dlam.run();
        System.out.println(dlam.name);


        //dlam.fish();报错，看左边
        //把动物类型的变量dlam转换成真实的cat类型
        Cat c=(Cat) dlam;
        c.fish();
        //多态下类型转换异常问题研究（重点）
        Animal a1=new Cat();
        if(a1 instanceof Cat){
            Cat c1=(Cat) a1;
            c1.fish();
        }
       // Dog d1=(Dog) a1;//编译阶段没有报错，在运行阶段可能出现classcastexception异常


        Animal td=new Dog();
        td.run();
        System.out.println(td.name);

        go(dlam);
    }
    public static void go(Animal d){
        System.out.println("start");
        d.run();
        System.out.println("end");
    }


}

class Dog extends Animal{
    public String name="DOG_NAME";
    @Override
    public void run(){
        System.out.println("Dog run");
    }
}

class Cat extends Animal{
    public String name="CAT_NAME";
    @Override
    public void run(){
        System.out.println("Cat run");
    }
    public void fish(){
        System.out.println("eat");
    }
}
class Animal{
    public  String name = "ANIMAL";
    public void run(){
        System.out.println("Animal run");
    }
}