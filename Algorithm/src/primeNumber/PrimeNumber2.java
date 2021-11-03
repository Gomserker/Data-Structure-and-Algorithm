package primeNumber;

public class PrimeNumber2 {

    /*
     소수를 구하며 그때까지 구한 소수를 배열 prime의 요소로 저장한다.
     이때, n이 소수인지 판단하려면 prime에 저장된 소수로 나누면 된다.  
     ex) 2는 소수이므로 prime[0]에 저장한다.
     그리고 찾은 소수의 갯수는 ptr이라는 변수에 저장하므로, prime[0]에 2를 저장한 뒤의 ptr은 1이 된다.
     
     3은 2로 나누어떨어지지 않으므로 prime[1], ptr=2
     5는 2,3으로 나누어떨어지지 않으므로 prime[2], ptr=3
     
     3이상의 소수는 이중 for문으로 구하되, n의 값을 2씩 더해 3,5,7,9...999까지 홀수만을 생성한다.
     4 이상의 짝수는 2로 떨어지기 때문이다.
     내부 for문은 i를 1부터 시작해 ptr - 1회 반복한다.
     */
    
    public static void main(String[] args) {
        int counter = 0; //나눗셈 횟수
        int ptr = 0; //찾은 솟수의 갯수
        int[] prime = new int[500]; //넉넉하게 잡은것 ㅇㅇ
        
        prime[ptr++] = 2; //2는 소수이므로 prime[0]은 2로, 계속 뒤에 추가되는 것.
        
        for (int n = 3; n <= 1000; n += 2) { //3, 5, 7, 9 ... 홀수만 나오게
            int i;
            for (i = 1; i < ptr; i++) { //이미 찾은 소수로 나누기
                counter++;
                if (n % prime[i] == 0) // 소수로 나누어떨어지면 소수가 아님
                    break; //반복 컷
            }
            if (ptr == i) //마지막까지 나누어떨어지지 않으면
                prime[ptr++] = n; //그 n 값은 소수로 판단, prime[]에 저장
        }
        
        for (int i = 0; i < ptr; i++) //찾은 소수들 프린트
            System.out.println(prime[i]);
        
        System.out.println("나눗셈 횟수: " + counter);
    }
    /*
     3은 내부 for문의 제어문에 걸려 실행되지 않음
     prime[0] = 2, ptr = 1
     prime [1] = 3.
     5는
     prime [1]에 저장한 3으로 나누어떨어지지 않음 prime[2]에 저장
     7은
     prime[1]인 3, prime[2]인 5로 나누어떨어지지 않음 prime[3]에 저장
     9는
     prime[1]인 3으로 떨어지므로 prime 배열에 저장되지 않는다.
     
        나눗셈 횟수: 14622로 혁명적으로 감소
     
     */
}
