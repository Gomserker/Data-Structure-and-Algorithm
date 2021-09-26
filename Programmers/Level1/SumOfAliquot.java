//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

Result
input 12 -> return 28 (1, 2, 3, 4, 6, 12의 합)
input 5 -> return 6 (1, 5의 합)
  
//Solution.java
class Solution {
  public int solution(int n) {
    int answer = 0;
    
    for (int i = 1; i <= n; i++) {
      if (n % i == 0){
        answer = answer + i;
      }
    }
    return answer;
  }
}
