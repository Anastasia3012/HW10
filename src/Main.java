import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Задача1
        int[] payment = {57890, 68049, 73214, 48214, 86324};
        int sum = 0;
        for (int element : payment) {
            sum = sum + element;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

//        Задача2
        int[] payout = {19752, 48861, 84521, 75631, 35486};
        int payoutMax = -1;
        for (int i = 0; i < payout.length; i++) {
            final int max = payout[i];
            if (max > payoutMax) {
                payoutMax = max;
            }
        }
        int payoutMin = payoutMax;
        for (int i = 0; i < payout.length; i++) {
            final int min = payout[i];
            if (min < payoutMin) {
                payoutMin = min;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + payoutMin + " рублей." + " Максимальная сумма трат за неделю составила " + payoutMax + " рублей.");

//        Задача3
        double [] repayment = {79653, 36841, 98766, 12045, 32659};
        double sum2 = 0;
        double average = 0;
        for (double element : repayment) {
            sum2 = sum2 + element;
        }
        average = sum2 / repayment.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");


//        Задача4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}