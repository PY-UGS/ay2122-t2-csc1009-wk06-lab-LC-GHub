package wk06_lab;
import java.util.*;

public class Week06_qn02 {
    public static void swapValues(LinkedList list, int value1, int value2){
        int temp = (int)list.get(value1); //temp = 3// (1,3,5,7,9,11)
        list.add(value2, temp); //1,3,5,7,9,3,11
        list.remove(value1); //1,5,7,9,3,11
        list.add(value1,(int)list.get(value2));//1,11,5,7,9,3,11
        list.remove(value2+1); //1,11,5,7,9,3
        

    }
    public static void main(String args[]){
        LinkedList LinkedList = new LinkedList();
        LinkedList.add(1);
        LinkedList.add(3);
        LinkedList.add(5);
        LinkedList.add(7);
        LinkedList.add(9);
        LinkedList.add(11);
        System.out.println("List before swapValues: " + LinkedList);
        swapValues(LinkedList, 1, 5);
        System.out.println("List after swapValues: " + LinkedList);

    }
    
}
