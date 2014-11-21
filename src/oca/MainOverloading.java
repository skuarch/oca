package oca;

/**
 *
 * @author skuarch
 */
public class MainOverloading {

    static void x(Object o) {
        System.out.println(o);
        System.out.println("object");
    }

    static void x(int o) {
        System.out.println(o);
        System.out.println("int");
    }

    static void x(double o) {
        System.out.println(o);
        System.out.println("doble");
    }

    static void x(long o) {
        System.out.println(o);
        System.out.println("long");
    }
    
    static void x(float o) {
        System.out.println(o);
        System.out.println("float");
    }

    public static void main(String[] args) {
        x(5);
        x('a');
    }

}
