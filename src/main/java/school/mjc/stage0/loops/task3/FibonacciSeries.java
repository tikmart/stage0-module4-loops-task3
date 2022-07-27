package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {

        int numOne = 0;
        int numTwo = 1;
        for (int i = 1; i <= lastFibonacci ; ++i) {

            System.out.println(numOne);

            int sumOfPrevTwo = numOne + numTwo;
            numOne = numTwo;
            numTwo = sumOfPrevTwo;



        }


    }

    public static void main(String[] args) {
        printFibonacci(3);
        printFibonacci(5);
        printFibonacci();

    }
}
