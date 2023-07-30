//pracitce of fibonacci series
import java.util.*;
public class function11 {
    public static void printFibonacciSeries(int nth){
        int num1=1,num2=0,num3=0;
        for(int i=0;i<nth;i++){
            System.out.print(num3+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int nth;
        while (true) {
            try {
                System.out.println("Enter the nth number of your fibonacci series");
                nth = Integer.parseInt(scan.nextLine());
                if (nth <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }
        
       // scan.close();
        printFibonacciSeries(nth);
    }
}
