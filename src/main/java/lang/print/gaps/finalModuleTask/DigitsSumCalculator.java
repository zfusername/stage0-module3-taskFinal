package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number % 1000 + (int)(number / 1000);
        System.out.println(sum);
    }
}
