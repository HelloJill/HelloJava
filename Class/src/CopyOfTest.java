import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {

    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3 };
        a = (int[]) goodCopyOf(a, 10);

        System.out.println(Arrays.toString(a));

        String[] b = { "Tom", "Dick", "Harry" };
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
//        b = (String[]) badCopyOf(b, 10);
    }

    public static Object[] badCopyOf(Object[] a, int newLength) // not useful
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a, int newLength)
    {
        //获得字节码文件
        Class cl = a.getClass();
        //如果不是数据,应该返回
        if (!cl.isArray()) return null;
        //获得字节码的数据类型,比如int,boolean(这种方法不会返回int[])
        Class componentType = cl.getComponentType();//获得组成类型
        //String name = cl.getTypeName();//获得字节码类型-->比如int[],int之类的
        //获得a数组的长度-->只有Array类型才可以使用
        int length = Array.getLength(a);
        //创建一个新的componentType类型数组对象
        Object newArray = Array.newInstance(componentType, newLength);
        //复制元素
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
