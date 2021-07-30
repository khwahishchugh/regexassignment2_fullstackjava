public class Assignment2_FirstPattern {
	public static void main(String[] args) 
	{
		int value=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(value);
				if(value==0)
					value++;
				else
					value--;
			}
			System.out.println();
		}
	}
}
