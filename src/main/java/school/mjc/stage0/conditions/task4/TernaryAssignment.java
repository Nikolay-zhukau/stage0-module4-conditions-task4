package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int firstOne = 10;
        int secondOne = -10;
        int result = (first >second) ? firstOne:secondOne;
        System.out.println(result);
    }
}
