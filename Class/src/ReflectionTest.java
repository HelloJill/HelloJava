import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name");
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifier = Modifier.toString(cl.getModifiers());
            if (modifier.length() > 0)
                System.out.print(modifier + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class)
                System.out.print(" extends " + supercl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethod(cl);
            System.out.println();
            printField(cl);
            System.out.print("\n}");
        }
        catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getConstructors();

        for (Constructor c : constructors) {
            String modifier = Modifier.toString(c.getModifiers());
            String name = c.getName();
            System.out.print("  ");
            if (modifier.length() > 0) {
                System.out.print(modifier + " ");
            }
            System.out.print(name + "(");

            //参数
            Class[] paraType = c.getParameterTypes();
            for (int i = 0; i < paraType.length; i++) {
                if (i > 0)
                    System.out.print(", ");
                System.out.print(paraType[i].getName());
            }
            System.out.print(");\n");
        }
    }
    public static void printMethod(Class c1) {
        Method[] method = c1.getMethods();

        for (Method m : method) {
            String name = m.getName();
            Class retType = m.getReturnType();
            String modifier = Modifier.toString(m.getModifiers());
            System.out.print("  ");
            if (modifier.length() > 0)
                System.out.print(modifier + " ");
            System.out.print(retType + " " + name + "(");
            Class[] paraType = m.getParameterTypes();
            for (int i = 0; i < paraType.length; i++) {
                if (i > 0)
                    System.out.print(", ");
                System.out.print(paraType[i].getName());
            }
            System.out.print(");\n");
        }
    }
    public static void printField(Class c1) {
        Field[] field = c1.getDeclaredFields();

        for (Field f : field) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifier = Modifier.toString(f.getModifiers());
            if(modifier.length() > 0)
                System.out.print(modifier + " ");
            System.out.print(type.getName() + " " + name + ";\n");
        }
    }
}

//**Field：**获取域——进入循环，输出描述符（modifier）——输出控制域所属类型（int、double等）——输出域的名字
//        **Method和Constructor：**获取域——进入循环，输出描述符（modifier）——输出构造函数/方法的名字——输出括号内的参数类型和名称
//"C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\lib\idea_rt.jar=52723:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_211\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\rt.jar;C:\code\HelloJava\out\production\Class" ReflectionTest
//        Enter class name
//java.lang.reflect.Field
//public final class java.lang.reflect.Field extends java.lang.reflect.AccessibleObject
//        {
//
//public class java.lang.Object get(java.lang.Object);
//public boolean equals(java.lang.Object);
//public class java.lang.String toString();
//public int hashCode();
//public int getModifiers();
//public boolean getBoolean(java.lang.Object);
//public byte getByte(java.lang.Object);
//public short getShort(java.lang.Object);
//public char getChar(java.lang.Object);
//public int getInt(java.lang.Object);
//public long getLong(java.lang.Object);
//public float getFloat(java.lang.Object);
//public double getDouble(java.lang.Object);
//public class java.lang.String getName();
//public interface java.lang.annotation.Annotation getAnnotation(java.lang.Class);
//public class [Ljava.lang.annotation.Annotation; getAnnotationsByType(java.lang.Class);
//public class [Ljava.lang.annotation.Annotation; getDeclaredAnnotations();
//public class java.lang.Class getDeclaringClass();
//public boolean isSynthetic();
//public class java.lang.String toGenericString();
//public interface java.lang.reflect.AnnotatedType getAnnotatedType();
//public interface java.lang.reflect.Type getGenericType();
//public class java.lang.Class getType();
//public boolean isEnumConstant();
//public void set(java.lang.Object, java.lang.Object);
//public void setBoolean(java.lang.Object, boolean);
//public void setByte(java.lang.Object, byte);
//public void setChar(java.lang.Object, char);
//public void setDouble(java.lang.Object, double);
//public void setFloat(java.lang.Object, float);
//public void setInt(java.lang.Object, int);
//public void setLong(java.lang.Object, long);
//public void setShort(java.lang.Object, short);
//public class [Ljava.lang.annotation.Annotation; getAnnotations();
//public interface java.lang.annotation.Annotation getDeclaredAnnotation(java.lang.Class);
//public class [Ljava.lang.annotation.Annotation; getDeclaredAnnotationsByType(java.lang.Class);
//public boolean isAnnotationPresent(java.lang.Class);
//public boolean isAccessible();
//public static void setAccessible([Ljava.lang.reflect.AccessibleObject;, boolean);
//public void setAccessible(boolean);
//public final void wait();
//public final void wait(long, int);
//public final native void wait(long);
//public final native class java.lang.Class getClass();
//public final native void notify();
//public final native void notifyAll();
//
//private java.lang.Class clazz;
//private int slot;
//private java.lang.String name;
//private java.lang.Class type;
//private int modifiers;
//private transient java.lang.String signature;
//private transient sun.reflect.generics.repository.FieldRepository genericInfo;
//private [B annotations;
//private sun.reflect.FieldAccessor fieldAccessor;
//private sun.reflect.FieldAccessor overrideFieldAccessor;
//private java.lang.reflect.Field root;
//private transient java.util.Map declaredAnnotations;
//
     //   }