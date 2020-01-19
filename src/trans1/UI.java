package trans1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basket
 */
public class UI {
    //        Map map;
//        Adjacency adj;
//        Scanner scanner = new Scanner(System.in);
//        int input = -1;
//        System.out.println("Pick map size, please give integer. Will be a square.");
//        
//        try {
//            String s_input = scanner.next();
//            input = Integer.parseInt(s_input);
//        }
//        catch (NumberFormatException e) {
//            System.out.println("Please choose a valid number.");
    Map map;
    private Adjacency adj;
    
    public UI() {  //(  , )
        
 
        this.map = new Map(10);
        this.adj = new Adjacency();
        
        this.plopNew(1, 1, "Gen");
        this.plopNew(2, 2, "Gen");
        this.plopNew(3, 3, "Gen");
        this.plopNew(4, 4, "Gen");
        this.plopNew(5, 5, "Gen");
        
//        adj.connect(1,2);
//        adj.connect(1,5);
        adj.connect(2,3);
//        adj.connect(2,5);
        adj.connect(3,4);
        adj.connect(4,5);
//        adj.connect(1,2);

        adj.viewAdj();
        
        System.out.println("FINAL: "+adj.connectedness());
        
    }
    
    
        private boolean plopNew(int x, int y, String type) {
        ItemBase newitem;
        
        if ("Gen".equals(type))
            newitem = new Gen(10);
        else if ("Load".equals(type))
            newitem = new Load(10);
        else if ("Sub".equals(type))
            newitem = new Sub();
        else {
            System.out.println("Incorrect ploptype: " + type + " --Trans1.plopNew");
            return false;
        }
        
        if(map.plop(newitem.getID(), x, y)) {
            adj.plop();
            return true;
        }
        return false;
    }
        
}
