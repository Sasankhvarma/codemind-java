import java.util.Scanner;

class kesava
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
                System.out.printf("%d ",n-j);
            }
            System.out.printf("
");
        }
    }
}