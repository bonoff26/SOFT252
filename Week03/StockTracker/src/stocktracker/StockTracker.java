/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.*;
/**
 *
 * @author tallenbrook
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhysicalStockItem objPhysicalItem = new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 0);
        ServiceStockItem objVirtualItem = new ServiceStockItem("Wintersmith: A Diskworld eBook by Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName()
                + ", Is in stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName()
                + ", Is in stock = " + objVirtualItem.isInStock()
                + ", Qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
        
    }
    
}
