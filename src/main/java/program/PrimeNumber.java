package program;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 0;
        int n = 7919;
        int m = n/2;
        boolean flag = false;

        if(n == 0 || n==1){
            System.out.println(n + " is not prime number");
        }
        else{
            for (i = 2; i <= m ; i++) {
                if(n%i==0){
                    System.out.println(n + " is not prime number");
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(n + " is prime number");
        }
    }
}
