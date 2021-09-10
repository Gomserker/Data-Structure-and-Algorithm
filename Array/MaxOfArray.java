import java.util.Scanner;

class MaxOfArray {
  //정수형 타입의 배열 값을 가지는 maxOf라는 이름의 메서드 생성
  static int maxOf(int[] a) { 
  //배열에서의 최댓값을 출력하는 알고리즘 사용
    // a[0]은 max로 초기화한다.
    int max = a[0];
    
    // 1부터 n-1회 실행하며 최대값을 비교한다.
    for (int i = 1; i < a.length; i++)
      if (a[i] > max)
        //비교한 후 큰 값이 순차적으로 max에 대입.
        max = a[i];
    
    //가장 큰 값이 된 a[i]의 component를 max로 return.
    return max;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("키의 최댓값을 구합니다.");
    System.out.print("인원 수: ");
    int num = input.nextInt();
    
    int[] height = new int[num];
    
    for (int i = 0; i < num; i++) {
      System.out.println("height [" + i + "] = " = );
      //입력받은 정수를 height Array의 i번 index에 대입.
      //height[0] = ?
      //height[1] = ?
      //height[2] = ?
      //...
      height[i] = input.nextInt();
    }
    
    //maxOf 메서드 실행
    System.out.println("최댓값은 " + maxOf(height) + "cm 입니다.");
  }
}
