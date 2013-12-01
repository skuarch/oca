package oca;

/**
 *
 * @author skuarch
 */
public class MainStringBuilder {
    
    /**
     * se puede pasar un objecto y cuando regrese no pierde la referencia.
     * @param args 
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("skuarch ");
        change(sb);
        System.out.println(sb.toString());
    }
    
    private static void change(StringBuilder sb){
        sb.append("es el rey");
    }
    
}
