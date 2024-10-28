/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author hieuh
 */
public class Item {
    protected int value;
    protected String creator;
    
   public Item(){
       
   }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input(){
        //input Value
        Scanner sc = new Scanner(System.in);
        int v = -1;
        do {
            System.out.println("Input a value (v>0): ");
            v = sc.nextInt();
    }
        while (v<=0);
        this.setValue(v);
        
        //input Creator
        String c="";
        do{
            System.out.println("Input creator(not empty) : ");
            sc = new Scanner(System.in);
            c = sc.nextLine();
    }
        while (c.trim().isEmpty());
        this.setCreator(c);
    }
    public void output(){
        System.out.println("Value: "+this.value);
        System.out.println("Creator: "+this.creator);
    }
    public static void main(String[] args){
        Item i = new Item();
        i.input();
        i.output();
    }   

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
}
