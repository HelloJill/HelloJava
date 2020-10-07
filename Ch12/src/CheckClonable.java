//实现clone
//(1) 实现Cloneable接口
//(2) 覆盖clone()
// (3) 在自己的clone()中调用super.clone()
// (4) 在自己的clone()中捕获异常
class Ordinary {}


class WrongClone extends Ordinary {
    public Object clone()
            throws CloneNotSupportedException {
        return super.clone(); // Throws exception
    }
}

// Does all the right things for cloning:
class IsCloneable extends Ordinary
        implements Cloneable {
    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}

// Turn off cloning by throwing the exception:
class NoMore extends IsCloneable {
    public Object clone()
            throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class TryMore extends NoMore {
    public Object clone()
            throws CloneNotSupportedException {
        // Calls NoMore.clone(), throws exception:
        return super.clone();
    }
}

class BackOn extends NoMore {
    private BackOn duplicate(BackOn b) {
        return new BackOn();
    }
    public Object clone() {
        // Doesn't call NoMore.clone():
        return duplicate(this);
    }
}

final class ReallyNoMore extends NoMore {}

public class CheckClonable {
    static Ordinary tryToClone(Ordinary ord) {
        String id = ord.getClass().getName();
        Ordinary x = null;
        if(ord instanceof Cloneable) {
            try {
                System.out.println("Attempting " + id);
                x = (Ordinary)((IsCloneable)ord).clone();
                System.out.println("Cloned " + id);
            } catch(CloneNotSupportedException e) {
                System.out.println(
                        "Could not clone " + id);
            }
        }
        return x;
    }
    public static void main(String[] args) {
        // Upcasting:
        Ordinary[] ord = {
                new IsCloneable(),
                new WrongClone(),
                new NoMore(),
                new TryMore(),
                new BackOn(),
                new ReallyNoMore(),
        };
        Ordinary x = new Ordinary();
        for(int i = 0; i < ord.length; i++)
            tryToClone(ord[i]);
    }
}
//输出
//Attempting IsCloneable
//    Cloned IsCloneable
//    Attempting NoMore
//    Could not clone NoMore
//    Attempting TryMore
//    Could not clone TryMore
//    Attempting BackOn
//    Cloned BackOn
//    Attempting ReallyNoMore
//    Could not clone ReallyNoMore