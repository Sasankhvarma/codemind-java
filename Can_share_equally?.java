import java.util.Scanner;
class k
{
    public static void main(String args[])
    {
        int X,Y;
        Scanner sc=new Scanner(System.in);
        X=sc.nextInt();
        Y=sc.nextInt();
        if(X==0 && Y%2==0)
    {
        System.out.printf("YES");
    }
    else if(X==0 && Y%2!=0)
    {
        System.out.printf("NO");   
    }
    else if((X+(2*Y))%2==0)
    {
        System.out.printf("YES");
    }
    else
    {
        System.out.printf("NO");
    }
    }
}