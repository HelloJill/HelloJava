public class Finalizer {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizer-->finalize()");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
        f = null;
    }
}
//无输出
