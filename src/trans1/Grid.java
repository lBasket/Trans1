/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;
import Jama.Matrix;
/**
 *
 * @author Basket
 */
public class Grid {
    private Matrix map;
    
    public Grid(int dim) {
        map = new Matrix(dim, dim);
        
    }
}
