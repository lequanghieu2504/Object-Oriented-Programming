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
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
        this.weight = 0;
        this.colour = "unknown";
    }
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void InputStatue(){
        Input();
         Scanner sc=new Scanner(System.in);
         System.out.println("Input a weight:");
         weight=sc.nextInt();
         System.out.println("Input a colour:");
         sc=new Scanner(System.in);
         colour =sc.nextLine();
    }
    public void OutputStatue(){
        Output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+colour);
    }
}
