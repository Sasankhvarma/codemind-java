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
        for(i=n-1;i>=0;i--)
        {
           if(arr[i]%2!=0)
           {
               c=i;
               break;
           }
        }
        System.out.printf("%d",c);
    }
}