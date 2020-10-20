class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShopClassLoader {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(
                "After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
//每个Class只有在它需要的时候才会载入
//    inside main
//    Loading Candy
//    After creating Candy
//        Loading Gum
//        After Class.forName("Gum")
//        Loading Cookie
//        After creating Cookie