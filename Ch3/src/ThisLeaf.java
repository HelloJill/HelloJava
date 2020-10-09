public class ThisLeaf {
    private int i = 0;
    ThisLeaf increment(){
        i++;
        return  this;//通过返回this来返回当前对象的句柄，方便对听一个对象执行多项操作
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        ThisLeaf x = new ThisLeaf();
        x.increment().increment().increment().print();
    }
}

