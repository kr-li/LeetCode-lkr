import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {

    public static void main (String[] args){
        Number number = new Number(2);
        while (number.i < 10){
            number.add();
            System.out.println(number.i);
        }
    }



}
class Number{
    int i;
    public Number(int i){
        this.i = i;
    }

    public void add(){
        i++;
    }
}
