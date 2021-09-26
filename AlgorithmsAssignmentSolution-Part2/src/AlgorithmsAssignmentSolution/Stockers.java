/**
 * 
 */
package AlgorithmsAssignmentSolution;
import java.util.Scanner;



/**
 * @author Shivam Sangal
 *
 */
public class Stockers {
	int sharePrice;
	boolean didStockRose;
	
	public Stockers() {
		this (0,false);
	}
	public Stockers(int sharePrice,boolean didStockRose) {
		sharePrice = sharePrice;
		didStockRose = didStockRose;
	}
	
	public static void stockInAscending() {
		
		Stockers s = new Stockers();
		System.out.println("stockInAscending");
		for (int i = 0; i < s.sharePrice; i++) { 
			System.out.print("sharePrice" + (i+1) + " : "); 
		        System.out.print(s.sharePrice + "\n"); 
		}
	}
  
	public static void stockInDescending() {
		Stockers s = new Stockers();
		System.out.println("stockInDescending");
		for (int i = 0; i < s.sharePrice; i++) { 
			System.out.print("sharePrice" + (i+1) + " : "); 
		        System.out.print(s.sharePrice + "\n"); 
		}
	}
	
	public static void companiesWithRoseStockPrice()
	{
		Stockers max = new Stockers();
		System.out.println("companiesWithRoseStockPrice" + max.sharePrice);
	}

	public static void companiesWithDeclinedStockPrice()
	{
		System.out.println("0");
	}
	
	public static void searchSpecificStock()
	{
		System.out.println("searchSpecificStock");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int noOfCompanies = Integer.parseInt(in.nextLine().trim());
		String arrayOfNames[] = new String[noOfCompanies];
		Stockers stu = new Stockers();
		Stockers max = new Stockers();
		for (int i = 0; i < arrayOfNames.length; i ++) {
			System.out.println("Enter current stock price of the company " + (i+1));
			stu.sharePrice = in.nextInt();
 		
			System.out.println("Whether today's stock price rose today");
			stu.didStockRose = in.nextBoolean();
			
			if (max.sharePrice < stu.sharePrice) {
				max.sharePrice = stu.sharePrice;
				max.didStockRose = stu.didStockRose;
			}	
		}
		
					
		System.out.println("1.Display the companies stock prices in ascending order");
		System.out.println("2.Display the companies stock prices in descending order");
		System.out.println("3.Display the total no of companies for which stock prices rose today");
		System.out.println("4.Display the total no of companies for which stock prices declined today");
		System.out.println("5.Search a specific stock price");
		System.out.println("6.Press 0 to exit");
		int selectedOption = in.nextInt();
		
		   int option= selectedOption;  
		    switch(option){  
		    case 1: stockInAscending();
		    break;  
		    case 2: stockInDescending();;
		    break;  
		    case 3: companiesWithRoseStockPrice();
		    break;  
		    case 4: companiesWithDeclinedStockPrice();
		    break;  
		    case 5: searchSpecificStock();
		    break;  
		    case 6: System.exit(0);
		    default:System.out.println("Invalid selection");  
		    }  
		
		in.close();
	}
}