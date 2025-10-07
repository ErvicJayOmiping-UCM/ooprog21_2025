import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double OVERTIME_MULTIPLIER = 1.5;

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        double regularHours = Math.min(hours, 40);
        double overtimeHours = Math.max(0, hours - 40);

        double regularPay = regularHours * rate;
        double overtimePay = overtimeHours * rate * OVERTIME_MULTIPLIER;

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}

