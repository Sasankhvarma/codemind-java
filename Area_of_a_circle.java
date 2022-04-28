import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        float r,area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        area=(float)(3.14*r*r);
        System.out.printf("%.2f",area);
    }
}