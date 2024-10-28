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
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        super();
        this.height = 0;
        this.material = "Unknown";
    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void InputVase(){
        super.input();
         Scanner sc=new Scanner(System.in);
         System.out.println("Input a height:");
         height=sc.nextInt();
         System.out.println("Input a material:");
         sc=new Scanner(System.in);
         material =sc.nextLine();
    }
    public void OutputVase(){
        super.output();
        System.out.println("Height: "+height);
        System.out.println("Material: "+material);
    }
}
