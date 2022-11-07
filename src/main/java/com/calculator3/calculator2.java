package com.calculator3;

public class calculator2 {

    public void add(int x, int y){
        int z = x + y;
        System.out.println("Sum of " +x + " and " + y + " is " +z);
    }
    public void subtract(int a, int b){
        int c = a - b;
        System.out.println("Subtract of "+a + " and " + b + " is " +c);
    }

    public static void main(String args[]){
        calculator2 calculator1 = new calculator2();
        calculator1.add(5, 6);
        calculator1.subtract(5, 6);
    }
}