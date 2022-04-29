import java.util.Scanner;

class spyder
{
    public static void main(String args[])
    {
        int c,f,r,k;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        f=(c*r*k)/100;
        System.out.printf("%d",f);
    }
}
