import java.util.Scanner;

class kesava
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.printf("%d",j);
            }
            System.out.printf("
");
        }
    }
}