public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }
   public int getRadius()//the 1st is the ;
   {
      return radius;//the 2nd bug is the radiuss is undefined
   }
      public void getDiameter()
   {
      return diameter;
   }
      public double getArea()
   {
      return area;
   }
}
   