import java.util.Scanner;
public class InterestEarned 
{
    public static void main(String[] args)
    {
      Scanner keyboard= new Scanner(System.in);
      double Principal;
      double InterestRate;
      double InterestCompound;
      double rate;
      double amount;
      double Interest;
      System.out.print("What is the Principal Amount: ");
      Principal=keyboard.nextDouble();
      System.out.print("What is the annual Interest rate: ");
      InterestRate=keyboard.nextDouble();
      System.out.print("The number of times interest is compounded during the year: ");
      InterestCompound=keyboard.nextDouble();
      rate=InterestRate/100.0;
      amount=Principal*Math.pow(1+(rate/InterestCompound),InterestCompound);
      Interest=amount-Principal;
      System.out.println();
      System.out.printf("Interest Rate: $%.2f\n",InterestRate);
      System.out.printf("Times Compound: $%.0f\n", InterestCompound);
      System.out.printf("Principal: $%.2f\n", Principal);
      System.out.printf("Interest earned: $%.2f\n", Interest);
      System.out.printf("Amount in savings: $%.2f\n", amount);


    }
}
