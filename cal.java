import java.util.Scanner;

public class Cal{
	public static void main (String args[]){
		int No1, No2;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("\n Enter Your Number 1 : ");
		No1 = myScanner.nextInt();
		
		System.out.print("\n Enter Your Number 2 : ");
		No2 = myScanner.nextInt();
		
		addition(No1,No2);
		subtraction(No1,No2);
	}
	
	public static void  addition(int No1, int No2){
		
		System.out.println("\n\n This is Addition ");
		System.out.println("\n Subtraction = " + (No1 + No2) );
	}
	
	public static void  subtraction(int No1, int No2){
		
		System.out.println("\n\n This is Subtarction ");
		System.out.println("\n Subtraction = " + (No1 - No2) );
	}
		
}