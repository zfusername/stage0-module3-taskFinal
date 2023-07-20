package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number % 10 + (int)((number % 100) / 10) + (int)(number / 1000) + (int)((number % 1000) / 100);
        System.out.println(sum);
    }
}
