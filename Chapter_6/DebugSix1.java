// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        System.out.print("Enter number of days >> ");//the semicolon
        days = keyboard.nextInt();

        while (day <= days) {// it reversed so i did put day <= days that gonna be true
            System.out.println("After day " + day + " you have " + money);//yhe days should be day cause printing the current day
            money = money * 2;
            ++day;
        }
    }
}
