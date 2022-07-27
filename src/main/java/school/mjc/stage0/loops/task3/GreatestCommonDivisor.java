package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {

        int gdc = 0;
        for (int i = 1; i <= first && i <= second ; i++) {

            if (first % i == 0 && second % i == 0){
                gdc = i;

            }

        }
        System.out.println(gdc);
    }

    public static void main(String[] args) {
        printGCD(25,30);
        printGCD(30,25);
        printGCD(30,30);
        printGCD(0,30);
    }

}
