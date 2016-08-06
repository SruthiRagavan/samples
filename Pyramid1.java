package wiproprog;
import java.util.Scanner;
public class Pyramid1 {
	public static void main(String q[])
	{
		int tmp=0,n,count=0,tmp1=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();{
		for(int i=0;i<n;i++)
		{
			tmp=tmp1;
			count++;
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<count;j++)
			{
				{
				if(j<=(count/2))
				{
					tmp++;
					if(tmp==10)
					{
						tmp=0;
						
					}
					
					System.out.print(tmp+" ");
					if(j==(count/2))
					{
						tmp1=tmp;
					
					}}
				else{
					tmp--;
					if(tmp<0)
					{
					tmp=9;
					}
					System.out.print(tmp+" ");
				}
			}}System.out.println();
		count++;}}
		}
}