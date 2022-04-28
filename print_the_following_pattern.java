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
            for(j=0;j<n-i;j++)
            {
                System.out.printf("%c ",(n-i-1)+65);
            }
            System.out.printf("
");
        }
    }
}