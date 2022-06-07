import java.util.Scanner;

class java 
{
    public static void main(String args[])
    {
        int n,i,j,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    c=1;
                }
            }
        }
        if(c==1)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
    }
}