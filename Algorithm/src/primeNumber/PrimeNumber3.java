package primeNumber;

/*
 25의 약수는 5까지만,
 100의 약수는 10까지만,
 225의 약수는 225까지만,
 사각형을 그린다고 가정할때 직사각형의 한 변의 길이까지만 소수로 나눗셈을 시도하고,
 그 과정에서 한번도 나누어떨어지지 않으면 소수라고 판단해도 된다.
 
 "n의 제곱근 이하의 어떤 소수로도 나누어떨어지지 않는다"
 */

public class PrimeNumber3 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];
        
        prime[ptr++] = 2;
        prime[ptr++] = 3; //2와 3은 소수다.
        
        for (int n=5; n<=1000; n+=2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }
        
        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);
        
        System.out.println("곱셈과 나눗셈한 횟수: " + counter);
    }
}
