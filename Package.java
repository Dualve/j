package com.company;

public class Package {
    static void amountOfPackage(int... amount) {
        System.out.println("Amount of packages : " + amount.length);
    }

    public int amountOfCigarettes(int... amount) {
        int sum = 0, counter = 0;
        for (int x : amount) {
            counter++;
            System.out.println("Cigarettes in the " + counter + " \'s package : " + x);
            sum += x;
        }
        return sum;
    }
}
