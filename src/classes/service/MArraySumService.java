package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

public class MArraySumService {
    private MArray array;
    public MArraySumService(MArray array){
        this.array = array;
    }
    public int getSum(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int sum = 0;
        for (int i = 0; i < this.array.getSize(); ++i){
            sum += this.array.getElementByIndex(i);
        }
        return sum;
    }
}
