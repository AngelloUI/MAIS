package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

public class MArrayMinMaxService {
    private MArray array;
    public MArrayMinMaxService(MArray array){
        this.array = array;
    }
    public int getMax(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int max = this.array.getElementByIndex(0);
        for (int i = 1; i < this.array.getSize(); ++i){
            if (this.array.getElementByIndex(i) > max){
                max = this.array.getElementByIndex(i);
            }
        }
        return max;
    }
    public int getMin(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int min = this.array.getElementByIndex(0);
        for (int i = 1; i < this.array.getSize(); ++i){
            if (this.array.getElementByIndex(i) < min){
                min = this.array.getElementByIndex(i);
            }
        }
        return min;
    }
}
