/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author tungi
 */
public class ItemList {

   Item[] list;
   int numOfItem;
   final int MAX = 100;
   
   public ItemList(){
       list = new Item[MAX];
       numOfItem = 0;
}
   public boolean addItem(Item item){
       if (item == null || numOfItem >=MAX)
           return false;
       list[numOfItem]++;
       
   }

}