package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("The number less then 4.");
                break;
            case 4:
                System.out.println("The num = 4.");
                break;
            default:
                System.out.println("The num more then 4 or less then 1.");
        }

        do {
            number++;
        } while (number < 100);
        System.out.println("Number: " + number);

        int VALUE = 10;
        int sum = 0;
        int[] arrOfNums = new int[VALUE];
        for (int i = 0; i < VALUE; i++) arrOfNums[i] = num.nextInt();
        for (int i : arrOfNums) sum += i;
        System.out.println("Sum : " + sum);

        float[][] newNumbers = {
                {12f, 12.1f, 12.7f},
                {13f, 13.1f, 13.7f},
                {14f, 14.1f, 14.7f}};
        for (float[] x : newNumbers) {
            for (float y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        Box newBox = new Box(10.2d, 10.7d, 10.9d); //экземпляр класса Box
        double volue1 = newBox.volume();
        Box secondBox = new Box(5.1234d);
        double volue2 = secondBox.volume();
        Box thirdBox = new Box(newBox);

        System.out.println();
        System.out.println("There are some types of boxes: ");
        System.out.println("1st type : " + (int)volue1 + " vol.");
        newBox.weightOfBox(volue1);
        newBox.weightOfBox((int) volue1);
        System.out.println();
        System.out.println("2nd type : " + volue2 + " vol.");
        secondBox.weightOfBox(volue2);
        secondBox.weightOfBox((int)volue2);
        System.out.println();
        System.out.println("3d type : " + thirdBox.volume() + " vol.");
        System.out.println();

        Stack myStack = new Stack();
        for (int i = 0; i < 10; i++)myStack.push(i);

        System.out.println("myStack consist of: ");
        for(int i =0; i < 10; i++)System.out.println(myStack.pop());

        Test te1 = new Test(2);
        Test te2;
        te2 = te1.increase();
        System.out.println("1st object - " + te1.a);
        System.out.println("2nd object - " + te2.a);
        te2 = te2.increase();
        System.out.println("2nd object after increase - " + te2.a);
    }
}
