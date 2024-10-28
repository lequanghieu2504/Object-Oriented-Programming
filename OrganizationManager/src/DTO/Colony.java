/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author hieuh
 */
public class Colony extends Organization {
    protected String place;         //land/ocean

    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    public void grown(){
        System.out.println("an annual cycle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    
    @Override
    public void comunicateByTool(){
        System.out.println("the colony communicate by sound");
    }

    @Override
    public String toString() {
         return "the colony’s size is " + size + ", the colony’s place is " + place;
    }
    
}
