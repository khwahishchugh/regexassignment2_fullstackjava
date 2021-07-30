package assignment2;
import java.util.*;
public class CountNumbers {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int no;
		System.out.println("Enter a number");
		no=s.nextInt();
		int positive=0,negative=0,zero=0;
		while(no!=-1)
		{
			if(no>0)
				positive++;
			if(no<0)
				negative++;
			if(no==0)
				zero++;
			System.out.println("Enter any number to continue and '-1' to stop");
			no=s.nextInt();
		}
		System.out.println("positive nos. count is equal to "+positive);
		System.out.println("negative nos. count until -1 encountered is equal to "+negative);
		System.out.println("zero occured "+zero+" times.");
	}
}
