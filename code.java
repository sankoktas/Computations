/** This program makes computations 
 * @author (Fikri San Koktas)
 * @version (13 January 2021)*/
import java.lang.Math;
import java.util.Scanner;
public class KFS_Computations_Main
{
    public static void main(String[] args)
    {
       //objective a
       int x;
       int total = 0;
       for(x= 2; x<= 100; x=x+2)
       {
            total = total + x;
       }
       System.out.println(total); 
       
       //objective b 
       int num = 1;
       int square;
       int sum = 0;
       while(num <= 100)
       {
            square = (num * num);
            sum = sum + square;
            num++;
       }
       System.out.println(sum);
       
       //objective c 
       int y;
       for(y = 0; y <= 20; y++)
       {
            System.out.println(Math.pow(2,y));
       }
       
       //objective d
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter number, a: ");
       int numA = input.nextInt(); 
       int a = numA;
       System.out.print("Enter number, b: ");
       int numB = input.nextInt(); 
       int oddSum = 0; 
       while (numA <= numB)
        {
            if ((numA % 2) > 0)
        {
            oddSum += numA; 
        }
        numA++; 
        }       
        System.out.println("The sum of all odd numbers between " + a + " and " + numB + " is " + oddSum);         
    
       //objective e 
       Scanner Mesut_Ozil = new Scanner(System.in);
       System.out.print("Number: ");
       int number = input.nextInt();
       int odd_digits_sum = 0;
       while (number > 0) 
       {
	int digit = number % 10;
	if (digit % 2 != 0) 
	{
		odd_digits_sum += digit;
	}
	number /= 10;
       }
       System.out.printf("Sum of %s's odd digits: %s", number, odd_digits_sum);   
    }
}
