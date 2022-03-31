package com.bridgelabz;

public class StringClass {
    public static void main(String[] args){
        Integer x1 = 11, x2 = 10, x3 = 12;
        Float y1 = 4.1f, y2 = 5.2f, y3 = 3.3f;
        String z1 = "pear", z2 = "apple", z3 = "orange";
        checkMax(x1,x2,x3);
        checkMax(y1,y2,y3);
        checkMax(z1,z2,z3);
    }
    private static void checkMax(String z1, String z2, String z3) {
        String max = z1;
        if (z2.compareTo(max) > 0)
            max = z2;
        if (z3.compareTo(max) > 0)
            max = z3;
        System.out.println("Max of "+z1+","+z2+" & "+z3+" is "+max);
    }
    private static void checkMax(Float y1, Float y2, Float y3) {
        Float max = y1;
        if (y2.compareTo(max) > 0)
            max = y2;
        if (y3.compareTo(max) > 0)
            max = y3;
        System.out.println("Max of "+y1+","+y2+" & "+y3+" is "+max);
    }
    private static void checkMax(Integer x1, Integer x2, Integer x3) {
        Integer max = x1;
        if (x2.compareTo(max) > 0)
            max = x2;
        if (x3.compareTo(max) > 0)
            max = x3;
        System.out.println("Max of "+x1+","+x2+" & "+x3+" is "+max);
    }
}
