package search;

import java.util.Arrays;
import java.util.Scanner;

/*
 Java는 배열에서 BinarySearch를 표준 라이브러리 메소드로 제공한다.
 java.util.Arrays 클래스의 binarySearch 메소드.
 
 Arrays 클래스의 binarySearch 메소드의 장점
 1. 이진 검색 메소드를 직접 쓸 필요가 없다.
 2. 모든 자료형의 배열에서 사용할 수 있다.
 
 static int binarySearch(Object[] a, Object key)
 오름차순으로 정렬된 배열 a를 가정하고, 키 값이 key인 요소를 이진 검색한다.
 
 검색에 성공하면 해당 요소의 인덱스를 반환,
 검색에 실패하면 입력한 값이 x라고 가정할때, -x-1 값을 반환한다.
 */
public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.print("요솟수: ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        System.out.println("오름차순으로 입력하시오");
        
        System.out.print("x[0] : ");
        x[0] = input.nextInt();
        
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = input.nextInt();
            } while (x[i] < x[i - 1]);
        }
        
        System.out.print("검색할 값");
        int key = input.nextInt();
        
        int idx = Arrays.binarySearch(x, key);
        
        if (idx < 0)
            System.out.println("그런거 없다.");
        else
            System.out.println(key + "은(는) x[" + idx + "]에 있다.");
    }
}
