

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection三种遍历方式
 *      1.迭代器
 *      2.foreach循环
 *      3.JDK1.8开始之后的Lambda表达式
 *  迭代器遍历集合：
 *      --方法：
 *         public IterATOR iterator():获取集合对应的迭代器
 *         E next():获取下一个元素值
 *         boolean hasNext()
 *     --流程
 *          1.先获取当前集合的迭代器
 *              Iterator<String> it = lists.iterator();
 *          2.while循环，使用it.hasnext（）
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("java");
        lists.add("spring");
        lists.add("study");
        //1.得到集合的迭代器对象
        Iterator<String > it=lists.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());   //出现异常，出现没有此元素异常
        //2.while
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }
        System.out.println("-------------------------");
        for(String ele:lists){
            System.out.println(ele);
        }

        int[] ages=new int[]{17,18,19};
        for(int age:ages){
            System.out.println(age);
        }
//        for (String list : lists) {
//
//        }
        lists.forEach(s -> {
            System.out.println(s);
        });
//


    }

}
