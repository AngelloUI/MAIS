package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

import java.util.Random;

public class MArraySortService {
    private MArray array;

    public MArraySortService(MArray array) {
        this.array = array;
    }

    public MArray countingSort() {
        int[] tempA = new int[100000];
        for (int i = 0; i < array.getSize(); ++i) {
            if (this.array.getElementByIndex(i) >= 0 && this.array.getElementByIndex(i) < tempA.length) {
                tempA[this.array.getElementByIndex(i)]++;
            } else {
                throw new MException("Элемент вне диапазона");
            }
        }
        int[] sortA = new int[this.array.getSize()];
        int k = 0;
        for (int i = 0; i < tempA.length; ++i) {
            while (tempA[i] > 0) {
                sortA[k] = i;
                k++;
                tempA[i]--;
            }
        }
        /*
        for (int i = 0; i < sortA.length; ++i) {
            System.out.println(sortA[i]);
        }
         */
        return new MArray(sortA);
    }
    public MArray squareSort(){
        for (int i = 0; i < this.array.getSize(); ++i){
            for (int j = 0; j < this.array.getSize(); ++j){
                if (this.array.getElementByIndex(i) > this.array.getElementByIndex(j)){
                    int temp = this.array.getElementByIndex(i);
                    this.array.setElementByIndex(i,this.array.getElementByIndex(j));
                    this.array.setElementByIndex(j,temp);
                }
            }
        }
        /*
        for (int i = 0; i < this.array.getSize(); ++i){
            System.out.println(this.array.getElementByIndex(i));
        }
         */
        return this.array;
    }
    private boolean isSort(){
        for (int i = 0; i < array.getSize() - 1; i++) {
            if (this.array.getElementByIndex(i) > this.array.getElementByIndex(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public MArray monkeySort(){
        Random random = new Random();
        while (!this.isSort()) {
            for (int i = 0; i < this.array.getSize(); i++) {
                int randIndex = random.nextInt(array.getSize());
                int temp = this.array.getElementByIndex(i);
                this.array.setElementByIndex(i,this.array.getElementByIndex(randIndex));
                this.array.setElementByIndex(randIndex,temp);
            }
        }
        for (int i = 0; i < this.array.getSize(); ++i){
            System.out.println(this.array.getElementByIndex(i));
        }
        return array;
    }
}
