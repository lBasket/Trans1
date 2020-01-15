/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;


/**
 *
 * @author Basket
 */
public class Gen extends ItemBase {
    private String name;
    private float capacity;
      
    public Gen (float i_capacity) {
        super();
        name = "Gen"+id;
        capacity = i_capacity;        
    }
    
    public String getName() {
        return name;
    }
    
    public float getCapacity() {
        return capacity;
    }
    
}
