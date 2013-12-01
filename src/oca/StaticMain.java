package oca;

/**
 *
 * @author skuarch
 */
public class StaticMain {

    static int i = 0;

    public static void main(String[] args) {
        i = 9;
        new StaticMain().something();
        System.out.println(i);
    }

    //este metodo puede acceder a las variables staticas sin ser statico
    public void something() {
        i = 4;
    }

}
