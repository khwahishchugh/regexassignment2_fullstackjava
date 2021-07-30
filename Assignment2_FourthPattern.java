public class Assignment2_FourthPattern 
{

	public static void main(String[] args) 
  {
		int b=0;
		for(int i=0;i<9;i++)
		{
			if(i==0 || i==8)
				System.out.println("$$$$$$$$$");
			else
			{
				for(int j=1;j<=9;j++)
				{
							if(j>=5-b&&j<=5+b)
						{
							System.out.print(" ");
						}
						else
							System.out.print("$");
				}
				System.out.println();
				if(i<4)
					b++;
				else
					b--;
			}
		}

	}

}
