import java.util.Scanner;

class java
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int i,j,q,r,s;
        for(i=a;i<=b;i++)
        {
            q=i;
            s=0;
            while(q!=0)
            {
                r=q%10;
                s=s*10+r;
                q=q/10;
            }
            if(s==i)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}