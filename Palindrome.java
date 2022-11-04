import java.util.Scanner;

class vin{
    public static int rev(int n){
        int s=0;
        while(n>0){
            s=s*10+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[]){
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        if (vin.rev(n)==n){
            System.out.printf("True");
        }
        else{
            System.out.printf("False");
        }
    }
}