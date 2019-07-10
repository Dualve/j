package com.company;

public class Main {

    public static void main(String[] args) {

        Package packages = new Package();
        int sum =packages.amountOfCigarettes(10,12,123,124);
        System.out.println("AMount of cigarettes in all : " + sum);
        Package.amountOfPackage(10,12,123,124);
        }
    }

