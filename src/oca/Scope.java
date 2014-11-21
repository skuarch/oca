package oca;

/**
 *
 * @author skuarch
 */
public class Scope {
    
    int phone = 123456789;
    
    public String getPhone(){
        String phone = "987654321";
        return phone;
    }
    
    public static void main(String[] args) {
     
        Scope scope = new Scope();
        System.out.println(scope.phone);
        
    }
    
}
