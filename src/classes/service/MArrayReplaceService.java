package classes.service;

import classes.entity.MArray;
import classes.exception.MException;

public class MArrayReplaceService {
    private MArray array;
    public MArrayReplaceService(MArray array){
        this.array = array;
    }
    public void replaceArray(int[] a){
        this.array.setArray(a);
    }
    public void replaceElementByIndex(int number, int index){
        if (index >= 0 && index < this.array.getSize()){
            this.array.setElementByIndex(index,number);
        }
        throw new MException("неверный индекс");
    }
    public void replaceAllDefinesNumbersToAnother(int num, int replaceNum){
        for (int i = 0; i < this.array.getSize(); ++i){
            if (this.array.getElementByIndex(i) == num){
                this.array.setElementByIndex(i,replaceNum);
            }
        }
    }
}
