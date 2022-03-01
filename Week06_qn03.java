package wk06_lab;
import java.util.*;

public class Week06_qn03 {

    public static int Search(ArrayList list, int searchVal){
        for(int i = 0; i< 100; i++){
            if((int)list.get(i) == searchVal){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        ArrayList array = new ArrayList<>();
        Random rand = new Random();

        int SearchValue = rand.nextInt(1000,9999);
        System.out.println("SearchValue is: " + SearchValue);

        for (int i = 0; i < 500; i++){
            array.add(rand.nextInt(1000,9999));
        }
    
        System.out.println(array);

        System.out.println("The index of value is at: " + Search(array, SearchValue));


         

        




    }
    
}
