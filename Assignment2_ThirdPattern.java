public class Assignment2_ThirdPattern 
{
	public static void main(String[] args) 
	{
		int value=1;
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
				{
					System.out.print(value);
					value++;
				}
			}
			if(i!=5)
				value--;
			for(int k=0;k<(5-i);k++)
				System.out.print(--value);
			if(i!=5)
				value++;
			System.out.println();
		}
	}
}
