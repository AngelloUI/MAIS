package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

public class MArrayAverageService {
    private MArray array;
    public MArrayAverageService(MArray array){
        this.array = array;
    }
    public double getAverage(){
        if (this.array == null || this.array.isEmpty()){
            throw new MException("Массив пустой");
        }
        int sum = 0;
        for (int i = 0; i < this.array.getSize(); ++i){
            sum += this.array.getElementByIndex(i);
        }
        return (double) sum / array.getSize();
    }
}
