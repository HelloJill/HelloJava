/**
 * 抽象类
 *  1.父类知道子类一定要完成某个功能，但是每个子类完成情况不一样
 *   子类以后只用自己重写的功能
 *  2.抽象方法
 *      抽象方法：没有方法体，只有方法签名，必须用abstract
 *      类必须定义为抽象类
 *  3.抽象类作用
 *      为了被子类继承
 *  4.必须重写完所有的抽象方法
 *  5.抽象类不能创建对象
 *      不能具体化
 *  6.抽象类是否有构造器？
 *    必须有构造器
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Dog taidi=new Dog();
        taidi.run();


    }
}

class Dog extends Animal1{
    @Override
    public void run(){
        System.out.println("dog run");
    }
}

class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("cat run");
    }
}

abstract class  Animal1{
    //抽象方法，没有方法体
    //拥有抽象方法的类必须定义位抽象类
    public abstract void run();
//    public void run(){
//        System.out.println("run fast");
//    }
}