package com.company;

public class Test {
    int a;
    final int TEN = 10;

    Test(int i){
        a = i;
    }

    Test increase(){
        Test temp = new Test(a + TEN);
        return temp;
    }
}
