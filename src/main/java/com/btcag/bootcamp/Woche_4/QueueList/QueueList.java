package com.btcag.bootcamp.Woche_4.QueueList;

import java.util.Arrays;

public class QueueList implements Interface{

    private int size;
    private int[] array = {1, 2, 3, 4, 5};

    public QueueList(){
        this.size = 6;
    }

    private int[] chooseArrayRightSize(){
        if (array.length +1 == size){
            int[] tempArray = new int[size*2];
            int counter = 0;
            for (int i : array ){
                tempArray[counter] = i;
                counter++;
            }
            return tempArray;
        }
        return array;
    }

    @Override
    public void popFront() {
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = array[i + 1];
        }
        this.array = newArray;
    }

    @Override
    public void popLast() {
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    @Override
    public int pushLast(int i) {
        int[] test = chooseArrayRightSize();
        int position = 0;
        int[] newArray = new int[test.length];
        for (int number : test){
            newArray[position] = number;
            position--;
        }
        newArray[1] = i;
        this.array = newArray;
        return 0;
    }

    @Override
    public int pushFront(int i) {
        int[] test = chooseArrayRightSize();
        int position = 1;
        int[] newArray = new int[test.length];
        for (int number : test){
            newArray[position] = number;
            position++;
        }
        newArray[0] = i;
        this.array = newArray;
        return 0;
    }

    @Override
    public int get(int i) {
        return 0;
    }

    public int[] getArray(){
        return this.array;
    }
}
