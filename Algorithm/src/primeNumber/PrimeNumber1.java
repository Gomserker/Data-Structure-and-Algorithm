package primeNumber;

// 1000 이하의 소수를 나열하는 프로그램 작성
// 소수란 자신과 1외의 그 어떤 정수로도 나누어떨어지지 않는 정수
// 13은 2부터 12까지 그 어떤 수와도 나누어 떨어지지 않는다.
// 11은 2부터 10까지 그 어떤 수와도 나누어 떨어지지 않는다.
// 따라서 2부터 n-1까지 어떤 정수로도 나누어 떨어지지 않는다면, 그 수는 소수이다.

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; //나눗셈한 횟수
        /*
        n = 9일때,
        i가 2부터 8까지 반복하는데, 3에서 n%i==0 조건에 걸려 내부 for문이 중단된다.
        따라서 2와 3, 2번의 나눗셈만 진행되며, i는 3인 상태에서 for문을 벗어난다.
        
        n = 13일때,
        i가 2부터 12까지 반복하는데, 11번의 나눗셈을 하는 동안 나누어떨어지지 않는다.
        따라서 11번의 나눗셈이 진행되며, i는 13인 상태에서 for문을 벗어난다.
        
        내부 for문의 반복이 종료된 시점에서 변수 i의 값은
        n이 소수일땐 n=i,
        n이 합성수일땐 n>i이다.
         */
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0)
                    break;
            }
            if (n == i)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
    /*
     하지만 n이 2나 3으로 나누어떨어지지 않으면 6으로도 나누어 떨어지지 않는다. 이런 식으로 위 알고리즘은 불필요한 계산도 하고 있는 것이다.
     따라서, 정수 n이 소수인지의 여부는 "2~n-1까지의 어떤 소수로도 나누어 떨어지지 않는다"를 확인하면 된다.
     7의 경우엔 7보다 작은 소수인 2,3,5로만 나눠보면 된다.(위 알고리즘에선 5번), 11의 경우엔 2,3,5,7로만 나눠보면 된다.(위 알고리즘에선 9번) 
     */
}
