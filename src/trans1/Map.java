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
 * 
 * Creates a map so you know where things have been plopped.
 * Put the items id in it's matrix position. 0 means no development.
 * 
 * Only doing squares for now.
 */
public class Map {
    private Matrix map;
    
    public Map(int dim){
        this.map = new Matrix(dim, dim);
    }
    
    public boolean plop(int id, int i, int j) {
        /*
        This method adds an item by setting the i,jth element to the items id
        If i,j != 0, land is developed and cannot be plopped.
        
        returns FALSE is already developed, TRUE otherwise
        */
        System.out.println(id);
        if (map.get(i,j) != 0) {
            System.out.println("Location taken. Choose new x,y coordinates.");
            return false;
        }
        else
            map.set(i, j, id);
        
        return true;
            
    }
}
