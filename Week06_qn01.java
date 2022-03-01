package wk06_lab;
import java.util.*;
import java.util.LinkedList;

public class Week06_qn01 {
    public static void sortAndAdd(LinkedList list,int value){
        //if value is lesser than first element (smallest)
        if(value < (int)list.get(0)){
            list.add(0,value);
        }
        //if value is larger than last element (largest)
        else if(value > (int)list.get(list.size()-1))
        {
            list.add(list.size(),value);
        }
        //if value belongs to somewhere in between
        else{
            for(int i = 1; i<list.size(); i++){
                int previous = (int)list.get(i-1);
                if((int)list.get(i) >= value && previous < value){
                    list.add(i, value);
                }
            }
        }
        
    }
    public static void main(String[] args){
    
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.add(11);
        System.out.println("Linked list before sortAndAdd: " + myLinkedList);
        sortAndAdd(myLinkedList, 6);
        System.out.println("Linked list after sortAndAdd: " + myLinkedList);
        
        

        


    }
    
}
