import java.util.Scanner;

class bhanu
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i,m=1;
        for(i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                System.out.println("True");
                m=0;
            }
        }
        if(m!=0)
        {
            System.out.println("False");
        }
    }
}