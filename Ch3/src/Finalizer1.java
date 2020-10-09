public class Finalizer1 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizer-->finalize()");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
        f = null;

        System.gc();//手动请求gc
    }
}
//输出 Finalizer-->finalize()
//垃圾回收和finalize()都是靠不住的，只要JVM还没有快到耗尽内存的地步，它是不会浪费时间进行垃圾回收的。
