import java.util.Scanner;

class jagan
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0,s=0,rep;
        for(i=0;i<n;i++)
        {
           s=s+arr[i];
        }
        float avg;
        avg=(float)s/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c=c+1;
            }
        }
        System.out.printf("%d",c);
    }
}