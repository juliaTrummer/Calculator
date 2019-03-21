import java.util.ArrayList;
import java.util.List;

public class Main implements Calculator {
        /*
       //Project: Calculator
       //Last changes: 21.03.2019
       //Author: Lea Franz, Julia Trummer
        */
        public List<Integer> values = new ArrayList();

    public int getMaximum() {
        //gets back the maximum
        return 0;
    }

    public int getMinimum() {
        //gets back the minimum
        return 0;
    }

    public void addValue() {

        values.add(value);
    }

    public static void main(String[] args) {

        Calculator calc = new CalculatorImpl();

        calc.add(20);    // currently highest number
        calc.add(4);    // currently lowester number
        calc.add(16);

        // add other integers

        // output lowest number

        // output highest number

        // output sum of all numbers


    }

}
