package datastructure;

import json.parser.JsonReaderUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> pizza= new LinkedList<>();

//        How to add a list or Queue ->referenceName.add
//        Add elements to Queue
        pizza.add("Vggie Pizza");
        pizza.add("Cheese Pizza");
        pizza.add("Pepperoni Pizza");
        pizza.add("Buffalo Chicken Pizza");
        pizza.add("Meqt Lover's Pizza");
        pizza.add("Ham Pizza");

//        Display the Queue
        System.out.println("The First Queue is : " + pizza);

        System.out.println("**********************************************************");

//        Create an iterator for the Queue
        Iterator<String> dominos = pizza.iterator();

//        display the values after iteration
        System.out.println("\n The Que after Iteration :");


        {

        } while (dominos.hasNext()) { //hasNest() return true or halse if there is data
            System.out.println(dominos.next());
        }

        System.out.println("**********************************************************");
        String hungry[] = {"Eat "," Dominos "," Live "," Beter"};//Made a 1D array
        for(String fatBaby : hungry) {
            System.out.print(fatBaby);
        }
        {
            System.out.println("************************************");
            pizza.poll(); //retrieves and removes  head of this Queue
            System.out.println("\nQueue after poll: " + pizza);

            pizza.remove(); //retrieves and removes head of this Queue
            System.out.println("\nQueue after remove : " +pizza);

            pizza.peek(); //retrieves head of thi Queue but does not remove
            System.out.println(pizza.peek());
            System.out.println("\nQueue after peek: " + pizza);

            pizza.element();//retrieves heaf of Queue but does not remove
            System.out.println("\nElement method displays : " + pizza.element());


            System.out.println(pizza.contains("Buffalo Chicken Pizza"));



        }

    }

}
