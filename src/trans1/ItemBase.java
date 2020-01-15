package trans1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basket
 * This class is just so I can have all my objects using the same AtomicInteger ID
 * So that I have no duplicate IDs.
 */
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ItemBase {
    static AtomicInteger nextid = new AtomicInteger();
    final int id;
    
    public ItemBase() {
        id = nextid.incrementAndGet();
    }
    
    public int getID() {
        return id;
    }
}
