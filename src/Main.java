import classes.entity.MArray;
import classes.service.MArraySortService;
import classes.validation.Validator;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Validator v = new Validator();
        int[] b = v.validator();
        MArray a = new MArray(b);
        a.setElementByIndex(0,1000);
        MArraySortService s = new MArraySortService(a);
        s.monkeySort();
    }
}