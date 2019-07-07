package com.company;

public class Stack {
    private final int VALUE = 10;
    private int tos;

    Stack(){
        tos = -1; //установка вершіны стека
    }

    private int[] stck = new int[VALUE];

    void push(int item){ //добавленіе элемента в стек
        if(tos == VALUE){
            System.out.println("Stack is full.");
        }
        else
            stck[++tos] = item;
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }

}

