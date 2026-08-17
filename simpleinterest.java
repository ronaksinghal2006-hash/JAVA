import java.util.Scanner;

public class simpleinterest {
   public simpleinterest() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter principal amount: ");
      double var2 = var1.nextDouble();
      System.out.println("Enter rate of interest: ");
      double var4 = var1.nextDouble();
      System.out.println("Enter time in years: ");
      double var6 = var1.nextDouble();
      double var8 = var2 * var4 * var6 / (double)100.0F;
      System.out.println("Simple Interest is: " + var8);
      var1.close();
   }
}
