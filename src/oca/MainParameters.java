package oca;

/**
 *
 * @author skuarch
 */
public class MainParameters {

    /**
     * cuando se pasa un objecto como parametro tambien se pasa la referencia.
     * @param args 
     */
    public static void main(String[] args) {

        String s = "super skuarch";
        s = changeString(s);
        
        System.out.println(s);
        
    }

    private static String changeString(String s) {
        return s += " mocos";
    }

}
