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
public class Load extends ItemBase {
    private String name;
    private float offtake;
      
    public Load(float i_offtake) {
        name = "Load"+id;
        offtake = i_offtake;        
    }
    
    public String getName() {
        return name;
    }
    
    public float getOfftake() {
        return offtake;
    }
    
}
