package problem.solving;

public class primeNumbers {
    public static void main(String[] args) {
        int counter = 0;
        int upToNumber = 100;
        for(int i = 2; i<upToNumber; i++){
            if(i == 2){
                System.out.println(i);
                counter ++;
            }else{
                if(isPrime(i)){
                    System.out.println(i);
                    counter++;
                }
            }
        }
        System.out.println("Total prime numbers as of " + upToNumber + " is " +counter);
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i = i + 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
