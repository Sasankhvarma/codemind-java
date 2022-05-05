import java.util.Scanner;

class square
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m,j;
        for(i=0;i<n;i++)
        {
            m=1;
            for(j=1;j<=(int)Math.sqrt(arr[i]);j++)
            {
                if(j*j==arr[i])
                {
                    System.out.printf("True
");
                    m=0;
                }
            }
            if(m==1)
            {
                System.out.printf("False
");
            }
        }
    }
}