import java.util.Scanner;

class ganesh
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || i==n-j-1)
                {
                    System.out.printf("x");
                }
                else
                {
                    System.out.printf("0");
                }
            }
            System.out.printf("
");
        }
    }
}