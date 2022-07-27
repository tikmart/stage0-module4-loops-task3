package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){

        String number = "";
        String result = number + t;
        int sum = 0;

        for (int i = 0; i <= result.length() ; i++) {
            sum = sum + Math.abs(t) % 10;
            t /= 10;

        }

        System.out.println(sum);


    }

    public static void main(String[] args) {
        printDigitsSum(243580001);
        printDigitsSum(243581);
        printDigitsSum(-24358);


    }
}
