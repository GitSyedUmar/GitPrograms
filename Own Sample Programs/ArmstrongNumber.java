import java.util.*;
public class ArmstrongNumber{

     public static void main(String []args){
         int input = 1634;
         int num = input;
         double sum = 0;
         int count = 0;
         
         while(num!=0){
             num = num / 10;
             count++;
         }
         
         num = input;
         while(num!=0){
             int part = num % 10;
             sum = sum + Math.pow(part,count);
             num = num / 10;
         }
         
         if (sum == input)
           System.out.println("Armstrong Number: "+sum);
         else
           System.out.println("Not Armstrong Number: "+sum);
     }
}