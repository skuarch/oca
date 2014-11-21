package oca;

/**
 *
 * @author skuarch
 */
public class FinalClass {
    
    final long mcoos;

    public FinalClass() {
        this.mcoos = 0;
    }
    
    public void other(){
        //this.mcoos = 0; //compilation error
    }
    
}
