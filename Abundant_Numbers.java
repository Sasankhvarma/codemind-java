import java.util.Scanner;

class java{
    public static void main(String args[]){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s=0;
        for(i=1;i<n;i++){
            if (n%i==0){
                s+=i;
            }
        }
        if (s>n){
            System.out.printf("True");
        }
        else{
            System.out.printf("False");
        }
    }
}