package oca;

/**
 *
 * @author skuarch
 */
public class StringOca {

    public static void main(String[] args) {
        
        String one = "one";
        String two = new String("one");
        
        System.out.println("one" == two);
        
        if(one == two){
            System.out.println("iguales");
        }else{
            System.out.println("no iguales");
        }
        
    }
    
}
