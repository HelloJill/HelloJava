

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * Collection集合体系
 *                          Collection(E)接口
 *                       /                           \
 *                 Set<E>接口                       List<E>接口
 *              /            \                      /         \
 *     HashSer<E>实现类  TreeSet<E>实现类    ArrayList<E>(实现类)LinkedList（实现类）
 *     /
 *  LinkedHashSet(实现类)
 *  集合的特点：
 *      Set集合：添加的元素无序，不重复
 *          --hashset：无序，不重复，无索引
 *          --linkedhashset：有序，不重复，无索引
 *          --treeset：按照大小默认升序排序
 *      List集合：有序，可重复，无索引
 *          --ArrayList：有序，可重复，有索引
 *          --linkedlist：有序，可重复，有索引
 *  常用api：
 *      public boolean add(E e)
 *      public void clear()
 *      public boolean remove(E e)
 *      public boolean contains(Object obj)
 *      public boolean isEmpty()
 *      public int size()
 *      public Object[] toArray()
 *
 *
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        //多态写法
        //hashset：添加的元素是无序，不重复，无索引
        Collection<String> sets=new HashSet<>();
        sets.add("java");
        sets.add("java");
        sets.add("Spring");
        System.out.println(sets);
        Object[] arrs=sets.toArray();
        System.out.println(Arrays.toString(arrs));
        //
        // Object[] arrs1=sets.toArray(String[]::new);
    }
}

