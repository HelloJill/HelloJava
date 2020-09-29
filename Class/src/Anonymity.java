

/**
 *匿名内部类
 * 1.什么是匿名内部类
 *      没有名字的局部内部类
 *      可以简化代码，常用
 * 2.格式
 *      new 类名|抽象类|接口（形参）{
 *          方法重写
 *      }
 * 3.特点
 *      1.是一个没有名字的内部类
 *      2.一旦写出来就会立即创建一个匿名内部类的对象返回
 *      3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型
 *
 *
 */
public class Anonymity {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("cat run");
            }
        };
        a.go();
        a.run();
        Swim bo=new Swim() {
            @Override
            public void swimming() {
                System.out.println("bo swim");
            }
        };
        go(bo);

        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("niu swim");
            }
        });

    }
    public static void go(Swim s){
        System.out.println("start");
        s.swimming();
        System.out.println("end");
    }
}
//class Cat extends Animal{
//
//    @Override
//    public void run() {
//        System.out.println("cat run");
//    }
//}
abstract class Animal{
    public abstract void run();
    public  void go(){
        System.out.println("go");
    }
}
interface Swim{
    void swimming();
}