public class Assignment2_SecondPattern 
{
	public static void main(String[] args) 
	{
		int value=5;
		for(int i=5;i>0;i--)
		{
			for(int j=5;j>0;j--)
			{
				if(value>i)
				{
					System.out.print(value);
					value--;
				}
				else
					System.out.print(value);
			}
			System.out.println();
			value=5;
		}
	}
}
