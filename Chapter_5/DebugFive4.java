// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4
{
   public static void main (String args[])
   {
   int one, two, three, four;
   int highest;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter an integer >> ");
   one = input.nextInt();
   System.out.print("Enter an integer >> ");
   two = input.nextInt();//the error is the input instead of two cause all reading is one that is wrong
   System.out.print("Enter an integer >> ");
   three = input.nextInt();//the error is the input instead of three
   System.out.print("Enter an integer >> ");
   four = input.nextInt();//the error is the input instead of four
   if(one > two && one > three && one > four)
   highest = one;
   else
   if(two > one && two > three && two > four)// the second condition uses ||  should be &&
   highest = two;
   else
   if(three == one && three > two && three > four)
   highest = three;
   else
   highest = four;
   System.out.println("The highest number is " + highest);
   }
}
