public class Data {
    int i;
    boolean b;
    char c;
    public int  f(){
//        int ii;
        int ii=2;
        return ii;
    }

    public static void main(String[] args) {
        Data d = new Data();
        System.out.println("类变量默认值i="+d.i);
        d.i=1;
        System.out.println("初始化类变量i="+d.i);
       // System.out.println("成员变量ii="+d.f());
    }

}
