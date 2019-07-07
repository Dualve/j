package com.company;

public class Box {

    private final int P = 1000;
    private double weidth;
    private double height;
    private double depth;

    Box(double weight, double height, double depth)
    {
        this.weidth = weight;
        this.height = height;
        this.depth = depth;
    }

    Box()
    {
        weidth = 0;
        height = 0;
        depth = 0;
    }

    Box(Box pb){
        weidth = pb.weidth;
        height = pb.height;
        depth = pb.depth;
    }

    Box(double len){
        weidth = height = depth = len;
    }

    double volume(){
        return weidth*height*depth;
    }

    void weightOfBox(double volue){
        System.out.println( volue * P + " weight of Box with accuracy to Double");
    }

    void weightOfBox(int volue){
        System.out.println( volue * P + " weight of Box with accuracy to INT");
    }
}
