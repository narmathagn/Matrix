import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int i,j,r,c;
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the values of R and C");
        r=s.nextInt();
        c=s.nextInt();
        System.out.println("enter the matrix elaments:");
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int temp[]=new int[r*c];
        int k=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                temp[k++]=a[i][j];
            }
            
        }
        Arrays.sort(temp);
        k=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=temp[k++];
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}