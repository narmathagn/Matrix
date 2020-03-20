import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int i,j,R,C;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of R nd C:");
		R=s.nextInt();
		C=s.nextInt();
		int a[][]=new int[R][C];
		for(i=0;i<R;i++)
		{
		    for(j=0;j<C;j++)
		    {
		        a[i][j]=s.nextInt();
		    }
		}
		int sumrow;
		for(i=0;i<R;i++)
		{
		    sumrow=0;
		    for(j=0;j<C;j++)
		    {
		        sumrow=sumrow+a[i][j];
		    }
		    System.out.println("sum of i row is:"+ sumrow);
		}
		int sumcol;
		for(i=0;i<C;i++)
		{
		    sumcol=0;
		    for(j=0;j<R;j++)
		    {
		        sumcol=sumcol+a[i][j];
		    }
		    System.out.println("sum of i col is:"+ sumcol);
		}
		
	}