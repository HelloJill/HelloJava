//在构造器中调用构造器
public class ThisFlower {
    private int petaCount = 0;
    private String s = new String("null");
    ThisFlower(int petals){
        petaCount=petals;
        System.out.println(
                "Constructor w/ int arg only, petalCount= "
                        + petaCount);
    }
    ThisFlower(String ss) {
        System.out.println(
                "Constructor w/ String arg only, s=" + ss);
        s = ss;
    }
    ThisFlower(String s, int petals) {
        this(petals);
//!    this(s); // Can't call two!
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }
    ThisFlower() {
        this("hi", 47);
        System.out.println(
                "default constructor (no args)");
    }
    void print() {
//!    this(11); // Not inside non-constructor!
        System.out.println(
                "petalCount = " + petaCount + " s = "+ s);
    }
    public static void main(String[] args) {
        ThisFlower x = new ThisFlower();
        x.print();
    }
}