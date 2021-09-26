//정수를 담고 있는 배열 arr의 평균값을 리턴하는 함수를 완성해 보세요

Result
input [1, 2, 3, 4] -> return 2.5
input [5, 5] -> return 5
  
//Solution.java
class Solution {
  public double solution(int[] arr) {
    
    double answer = 0;
    
    for (int i = 0; i < arr.length; i++) {
      answer = answer + arr[i];
    }
    
    answer = answer / arr.length;
    
    return answer;
  }
}
