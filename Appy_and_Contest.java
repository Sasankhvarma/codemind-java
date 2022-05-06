import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        for(int o=0;o<k;o++)
        {
            long n,a,b,l,i,c=0,m=0;
            n=sc.nextLong();
            a=sc.nextLong();
            b=sc.nextLong();
            l=sc.nextLong();
            for(i=1;i<=n;i++)
            {
                if(i%a==0 && i%b!=0)
                {
                    c++;
                }
                else if(i%a!=0 && i%b==0)
                {
                    c++;
                }
            if(c>=l)
            {
                System.out.printf("Win
");
                m=1;
                break;
            }
            }
            if(m==0)
            {
                System.out.printf("Lose
");
            }
        }
    }
}