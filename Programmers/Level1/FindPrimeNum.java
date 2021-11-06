// 1부터 입력받은 숫자 n 사이에 있는 소수의 갯수를 반환하는 함수 작성하시오.
// n은 2 이상 1,000,000 이하의 자연수.
// example
// n = 10, result = 4 (2,3,5,7)
// n = 5, result = 3 (2,3,5)

1)
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] numbers = new int [n+1];
        
      //2부터 n 사이의 자연수를 배열에 저장
        for(int i=2; i<=n; i++){
            numbers[i] = i;
        }
        
        for(int i=2; i<n; i++){
            if(numbers[i] == 0){
                continue;
            }
          //자신을 제외한 j의 배수를 0으로 저장
            for(int j=2*i; j<=n; j+=i){
                numbers[j] = 0;
            }
        }
        
      //자연수가 저장된 배열 numbers에서 0으로 저장된 수의 갯수 출력
        for(int i=0; i<numbers.length; i++){
            
            if(numbers[i] != 0){
                answer++;
            }
        }
        return answer;
    }
}

2)
//위 알고리즘은 2부터 n까지 모든 자연수를 검사하기 때문에 n의 수가 클수록 불필요한 연산이 증가한다.
//제곱근을 활용한 개선된 알고리즘
  
  class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] primeNum = new boolean [n+1];
        
      //논리값을 데이터로 가지는 primeNum의 초기값을 전부 true로 설정
        for (int i = 2; i <= n; i++){
            primeNum[i] = true;
        }
        
      //n의 제곱근.
        int root = (int)Math.sqrt(n);
        
      
        for(int i = 2; i <= root; i++){
            if(primeNum[i] == true){
                for(int j = i; i*j <= n; j++){
                    primeNum[i*j] = false;
                }        
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if(primeNum[i] == true) {
                answer++;
            } 
        }
    return answer;
    }
}
