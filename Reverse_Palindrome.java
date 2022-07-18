import java.util.Scanner;

class java
{
    public static int rev(int n)
    {
        int q,r,s=0;
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int n,k=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n=n+rev(n);
        while(k!=0)
        {
            if(n==rev(n))
            {
                System.out.println(n);
                k=0;
                break;
            }
            else
            {
                n=n+rev(n);
            }
        }
    }
}