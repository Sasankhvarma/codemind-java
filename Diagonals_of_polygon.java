import java.util.Scanner;

class spyder
{
    public static void main(String args[])
    {
        int c,f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        
        f=c*(c-3)/2;
        System.out.printf("%d",f);
    }
}
