// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
public class DebugThree1
{
public static void main(String args[])
{
double check1;
double check2;
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of your check >> ");
check1 = input.nextInt();
System.out.print("Enter the amount of your friend's check >> ");
check2 = input.nextInt();//the only error is missing (.) next to input
calcTip(check1);
calcTip(check2);
}
public static void calcTip(double bill)//i put double bill to call the method calcTip
{
final double RATE = 0.15;// error of this line is the spelling doubel into double
double tip;
tip = bill * RATE;// the divide is wrong So i change it into bill x Rate
System.out.println("The tip should be at least $" + tip);
}
}
