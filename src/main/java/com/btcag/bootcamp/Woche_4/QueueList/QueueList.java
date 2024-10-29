package com.btcag.bootcamp.Woche_4.QueueList;

public class QueueList implements Interface{

    private int size;
    private int[] array;

    public QueueList(){
        this.size = 1;
        this.array = new int[1];
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
    public int popFront() {


        return 0;

    }

    @Override
    public int popLast() {
        return 0;
    }

    @Override
    public int pushLast(int i) {
        int[] test = chooseArrayRightSize();
        int position = 1;
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
