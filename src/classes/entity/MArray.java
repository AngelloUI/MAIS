package classes.entity;

import classes.exception.MException;

public class MArray {
    private int size;
    private int[] array;

    public MArray(int size){
        this.size = size;
        this.array = new int[this.size];
    }
    public MArray(int[] a){
        this.array = a;
        this.size = a.length;
    }
    public int getElementByIndex(int i){
        if (i >= 0 && i < this.getSize()){
            return this.array[i];
        }
        throw new MException("неверный индекс");
    }
    public void setElementByIndex(int i, int number){
        if (i >= 0 && i < this.getSize()){
            this.array[i] = number;
        }else{
            throw new MException("неверный индекс");
        }
    }
    public boolean isEmpty(){
        return this.array.length == 0;
    }
    public int getSize(){
        return this.size;
    }
    public int[] getArray(){
        return this.array;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setArray(int[] array){
        this.array = array;
    }
}
