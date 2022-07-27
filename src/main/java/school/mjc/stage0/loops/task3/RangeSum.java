package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void printSumInclusive(int firstBoarder, int secondBoarder) {

        int range = 0;

        for(int i = firstBoarder; i <= secondBoarder; i++){
            range +=i;
        }

        System.out.println(range);


    }

    public static void main(String[] args) {
        printSumInclusive(1,10);
        printSumInclusive(100,100);
        printSumInclusive(-100,100);
    }
}
