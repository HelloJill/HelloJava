

import java.util.ArrayList;

/**
 * 泛型
 * <数据类型>
 *     泛型和集合都智能支持引用数据类型，不支持基本数据类型
 *     泛型可以再编译阶段约束智能操作某种数据类型，不会出现类型转换异常
 *
 * 自定义泛型类
 *      格式：
 *          修饰符 class 类名<泛型变量>{
 *
 *          }
 *          泛型变量建议使用：E,T,K,V
 * 通配符：？
 *      ？可以用在使用泛型的时候代表一切类型
 *      E,T,K,V在定义泛型的时候代表一切类型
 * 泛型的上下限：
 *      ？ extend Car：那么？必须是Car或者其子类（泛型的上限）
 *      ？ super Car：那么？必须是Car或者其父类（泛型的下限）
 *
 *
 */
public class Genericity {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        // list1.add(true);//报错

        MyArrayList<String> list2=new MyArrayList<>();
        list2.add("java");


    }
}
class  MyArrayList<E>{
    public void add(E e){

    }
    public void remove(E e){

    }

}