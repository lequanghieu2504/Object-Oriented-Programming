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
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
        super();
        this.height = 0;
        this.width = 0;
        this.isWaterColour = false;
        this.isFramed =false;
    }
    public Painting(int value, String creator, int height, int weight, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = weight;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWeight(int width) {
        this.width = width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void InputPainting(){
        super.Input();
         Scanner sc=new Scanner(System.in);
         System.out.println("Input a height:");
         height=sc.nextInt();
         System.out.println("Input a width:");
         sc=new Scanner(System.in);
         width =sc.nextInt();
         System.out.println("Is it Water colour ?:");
         sc=new Scanner(System.in);
         isWaterColour =sc.nextBoolean();
         System.out.println("Is it Framed ?:");
         sc=new Scanner(System.in);
         isFramed =sc.nextBoolean();
    }
    public void OutputPainting(){
        super.Output();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Water Colour: "+isWaterColour);
        System.out.println("Framed: "+isFramed);
    }
}
