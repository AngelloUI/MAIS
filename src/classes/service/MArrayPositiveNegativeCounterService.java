package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

public class MArrayPositiveNegativeCounterService {
    private MArray array;
    public MArrayPositiveNegativeCounterService(MArray array){
        this.array = array;
    }
    public int countPositive(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int amount = 0;
        for (int i = 0; i < this.array.getSize(); ++i){
            if (this.array.getElementByIndex(i) > 0) {
                amount += this.array.getElementByIndex(i);
            }
        }
        return amount;
    }
    public int countNegative(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int amount = 0;
        for (int i = 0; i < this.array.getSize(); ++i){
            if (this.array.getElementByIndex(i) < 0) {
                amount += this.array.getElementByIndex(i);
            }
        }
        return amount;
    }
}
