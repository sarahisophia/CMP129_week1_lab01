import java.util.Scanner;
public class BoxOffice 
{
    public static void main(String[] args)
     {
        Scanner keyboard= new Scanner(System.in);
        String MovieName;
        int AdultTickets;
        int ChildTickets;
        double GrossProfit;
        double NetProfit;
        double TotalAmount;
        System.out.print("Enter the name of the movie: ");
        MovieName = keyboard.nextLine();
        System.out.print("Enter the number of adult tickets sold: ");
        AdultTickets = keyboard.nextInt();
        System.out.print("Enter the number of child tickets sold: ");
        ChildTickets = keyboard.nextInt();
        AdultTickets= AdultTickets*10 ;
        ChildTickets=ChildTickets*6;
        GrossProfit=AdultTickets+ChildTickets;
        NetProfit=GrossProfit*0.20;
        TotalAmount=GrossProfit-NetProfit;
        System.out.println("Movie Name:     "+MovieName);
        System.out.println("Adult Tickets Sold:      "+AdultTickets);
        System.out.println("Child Tickets Sold:      "+ChildTickets);
        System.out.println("Gross Box Office Profit:      "+GrossProfit);
        System.out.println("Net Box Proft:      "+NetProfit);
        System.out.println("Amount Paid to Distributor:      "+TotalAmount);
        
    }
}
