package oca;

/**
 *
 * @author skuarch
 */
public class TestStudent {

    public TestStudent() {
    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "skuarch";
        Student s2 = new Student();
        s2.name = "mocos";
        s2 = s;
        
        s.name = "one";
        System.out.println("s2 = " + s2.name);
        System.out.println("s = " + s.name);
        s2.name = "two";
        System.out.println("s2 = " + s2.name);
        System.out.println("s = " + s.name);
        
        
    }
            
    
}
