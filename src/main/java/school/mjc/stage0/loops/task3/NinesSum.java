package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {



        int nine = 9;
        int sum = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += nine;
            nine = 10 * nine + 9;





        }

        System.out.println(sum);


    }

    public static void main(String[] args) {
        calculateSum(5);
        calculateSum(6);
        calculateSum(-6);
        calculateSum(0);
    }
}
