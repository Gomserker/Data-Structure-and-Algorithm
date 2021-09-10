//키를 직접 입력받는 것이 아닌 무작위 난수를 생성해서 최댓값 출력

import java.util.Scanner;
import java.util.Random;

class MaxOfArrayWithRandomNumber {
  static int maxOf(int[] a) {
    int max = a[0];
    
    //배열에서의 최댓값을 구하는 알고리즘
    for (int i = 1; i < a.length; i++)
      if (a[i] > max)
        max = a[i];
    
    return max;
  }
  
  public static void main(String[] args){
    //Scanner는 외부 입력, Random은 무작위 수를 생성하는 클래스.
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    System.out.println("무작위로 생성된 숫자 중에서의 최댓값을 구합니다.");
    
    System.out.print("인원 수: ");
    int num = input.nextInt();
    
    int[] height = new int[num];
    
    for (int i = 0; i < num; i++) {
      // height의 component, i번 인덱스에 100 + (0부터 89 사이의 난수) 값을 대입한다.
    	height[i] = 100 + random.nextInt(90);
    	System.out.println("height[" + i + "] = " + height[i]);
    }
    
    System.out.println("최댓값은 " + maxOf(height) + "입니다.");
  }
}
    
