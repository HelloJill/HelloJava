public class Alias1 {
    int i;
    Alias1(int ii) { i = ii; }
    public static void main(String[] args) {
        Alias1 x = new Alias1(7);
        Alias1 y = x; // 新建Alias1的引用，x的地址分配到y，二者与相同的对象连接
        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
        System.out.println("Incrementing x");
        x.i++;
        System.out.println("x: " + x.i);
        System.out.println("y: " + y.i);
    }
}
//运行结果
//x: 7
//y: 7
//Incrementing x
//x: 8
//y: 8