/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trans1;

import Jama.Matrix;
import java.util.ArrayList;

/**
 *
 * @author Basket
 * 
 * This is going to be an adjancency matrix, n x n where n = (num gens + num loads + num substations)
 * 0 = not connected
 * 1 = connected
 * 
 */
public class Adjacency {
    private Matrix adj;
    private int elements;
    
    public Adjacency() {
        //Doesn't appear any issues for creating a 0x0 matrix. Nice
//        adj = new Matrix(0, 0);
        elements = 0;
    }

    public void plop() { //no id input yet because deletion not implemented, not yet needed        
        /*
        So, this method should construct a an elements+1 x elements+1 matrix of ones,
        multiply the old matrix to duplicate all those values, then set
        the 'elements'th row and column to all 0s, then elements = elements + 1
        */
        if(elements == 0) {
            elements++;
            adj = new Matrix(elements, elements, 0);
            return;
        } else {
            elements++;
            Matrix old = adj;
            adj = new Matrix(elements, elements, 0);
            for(int i=0; i<elements-1; i++) { 
                for(int j=0; j<elements-1; j++) {
                    adj.set(i, j, old.get(i, j));
                }
            }
        }
    
    }
    
    public void connect(int id1, int id2) {
        /*
        Connects 2 items. Inputs are id's; since deletion not implemented, index = id-1
        After deletion, lookup table or something similar will need to be used.
        */
        adj.set(id1 - 1, id2 - 1, 1);
    }
    
    public void disconnect(int id1, int id2) { 
        /*
        Disconnects 2 items. Inputs are id's; since deletion not implemented, index = id-1
        After deletion, lookup table or something similar will need to be used.
        */
        adj.set(id1 - 1, id2 - 1, 0);
    }

    public void viewAdj() {
        String columns = "";
        for(int i=0; i<=elements; i++){ 
            columns = columns + " " + i;
        }
        columns += "\n";
        
        adj.print(3, 0);
        
    }
    
    public void connectedness() {
        //initialize
        ArrayList<Integer> to_check = new ArrayList<>();
        ArrayList<Integer> pending = new ArrayList<>();
        ArrayList<Integer> connected = new ArrayList<>();
        ArrayList<Integer> temp_list = new ArrayList<>();
        ArrayList<Integer> list_of_lists = new ArrayList<>();
        int currid;
        
        for(int i=0; i<elements; i++) { //populate initial list of all idxs
            to_check.add(i);
        }
        
        while(!to_check.isEmpty()) {
            currid = to_check.get(0);
            to_check.remove(0);
            connected.add(currid);
            
            for(int i=0; i<elements; i++) { //check for adjacents
                if(adj.get(i, elements ) == 1) {
                    //adjacent, add to temp_list
                    temp_list.add(i);                    
                }
            }
            if(temp_list.size() > 0) {
                //if you found some, rmv ones that aren't in tocheck
                for(int i=0; i<temp_list.size(); i++ ) {
                    if(to_check.contains(temp_list(i))) {
                        
                    }
                }
                
                //then add rest to pending & connected
            }
        
        }
            
    }

}

