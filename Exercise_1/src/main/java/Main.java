import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Calculator {
    /*
   //Project: Calculator
   //Last changes: 21.03.2019
   //Author: Lea Franz, Julia Trummer
    */
    public List<Integer> values = new ArrayList();

    public int getMaximum(List<Integer> list) {
        //gets back the maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int getMinimum(List<Integer> list) {
        //creates a List
        List<Integer> sortedlist = new ArrayList(list);
        //sorts list from smallest to largest number
        Collections.sort(list);
        //returns first element of list
        return sortedlist.get(0);
    }

    public void addValue(int value) {
        values.add(value);
    }

    public static void main(String[] args) {

        Calculator calc = new Main();

        calc.addValue(20);    // currently highest number
        calc.addValue(4);    // currently lowester number
        calc.addValue(16);

        // add other integers
        System.out.println("Hello!");
        // output lowest number

        // output highest number
        System.out.println(calc.getMaximum(((Main) calc).values));


        // output sum of all numbers


    }

}
