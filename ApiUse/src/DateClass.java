

import java.util.Date;

/**
 * Date日期类的使用
 * JAVA面向对象，会用一个类代表一个事务
 * Date类在java中代表的是系统当前此刻日期时间对象
 *
 * Date类：
 *      包：java.util.Date
 *      构造器：
 *          public Date():
 *              创建当前系统的此刻日期时间对象
 *              public Date(long time)
 *      方法：
 *          public long getTime():
 *              返回自1970年1月1日零点。。。。。
 *      时间记录的两张方式：
 *          Date日期对象
 *          时间毫秒值   可以用于做时间的计算，代码执行性能分析
 *      public Date(long time) 把时间毫秒值转换成日期对象
 * DateFormat：时间格式化
 *      DateFormat是一个抽象类，不能直接使用，要找它的子类：simpleDateFormat
 *      包：java.util.text.simpleDateFormat
 *      构造器：public simpleDateFormat(String pattern)
 *      方法：
 *          public String format(Date date)
 *          public String format(Object time)
 *          public Date parse(String date)
 *
 */
public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time=d.getTime();
        System.out.println(time);


    }
}
