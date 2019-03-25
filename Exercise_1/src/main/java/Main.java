

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Calculator {
    /*
   //Project: Calculator
   //Last changes: 25.03.2019
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
        //sorts list from smallest to largest number
        Collections.sort(list);
        //returns first element of list
        return list.get(0);
    }

    public void addValue(int value) {
        //adds value to a List
        values.add(value);
    }

    public static int getSum(List<Integer> list) {
        //gets summ of all integers in list
        int sum = 0;
        //interate through list and adds value from list to sum;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }


    public static void main(String[] args) {

        Calculator calc = new Main();

        calc.addValue(20);    // currently highest number
        calc.addValue(4);    // currently lowester number
        calc.addValue(16);

        // add other integers
        calc.addValue(5);
        calc.addValue(22);
        calc.addValue(12);
        calc.addValue(15);
        calc.addValue(2);


        // output lowest number
        System.out.println("Minimum: "+calc.getMinimum(((Main) calc).values));

        // output highest number
        System.out.println("Maximum: "+calc.getMaximum(((Main) calc).values));

        // output sum of all numbers
        System.out.println("Sum: "+getSum(((Main) calc).values));

    }

}
