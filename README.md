import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        System.out.println("enternumber 1 ");
        Scanner sc= new Scanner(System.in);
        int first= sc.nextInt();
        System.out.println("enter second number");
       
        int Second= sc.nextInt();
        System.out.println("sum of two number is : "+(first+Second));
        sc.close();


    }

}
