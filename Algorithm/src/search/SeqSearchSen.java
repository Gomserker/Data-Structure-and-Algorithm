package search;

import java.util.Scanner;

/*
 보초법(sentinel method)
 [선형 검색 종료 조건]
 1. 검색할 값을 발견하지 못하고 처음부터 끝까지 훑었을때.
 2. 원하는 값을 찾았을때.
 
 선형 검색은 반복할 때마다 2가지 조건을 모두 판단한다. 이때 필요한 자원을 줄이는 방법이 보초법(sentinel method)이다.
 배열 a의 a[0]부터 a[7]까지 있다고 가정한다.
  0  1  2  3  4  5  6    7
 [6][4][3][2][1][3][8] [보초]
 a[0]부터 a[6]은 초기에 준비해 놓은 데이터고, 검색하고자 하는 키 값을 맨 끝 자리인 a[7]에 놓고 이 값을 보초(sentinel)라고 한다.
 예를 들어, 2를 검색하고 싶으면 끝에 2를 놓고, 5를 검색하고 싶으면 5를 놓는다. 
 
 1) 원하는 값(2)가 준비된 데이터([0]~[6]) 사이에 있을 때
  0  1  2  3  4  5  6   7
 [6][4][3][2][1][3][8] [2]
 
 → 2가 있으므로 중간에 멈춘다. 
 
 2) 원하는 값(5)가 준비된 데이터 사이에 없을때
  0  1  2  3  4  5  6   7
 [6][4][3][2][1][3][8] [5]
 
 → 5(보초값)에 걸리므로 멈춘다.
 따라서 위의 검색 종료 조건의 1번을 수행하지 않고 2번만 수행하게 된다.
 
 */
public class SeqSearchSen {
    static int SeqSearchSen(int[] a, int n, int key) {
        int i = 0;
        
        a[n] = key; // 보초(sentinel)
        
        while (true) {
            if (a[i] == key) //검색 성공
                break;
            i++;
        }
        return i == n ? -1 : i; // i==n이면 -1 return 아니면 i return
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("요솟수: "); //초기에 준비한 값
        int num = input.nextInt();
        int[] x = new int[num + 1]; //초기에 준비한 값 + 보초값
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = (int) (Math.random() * 100);
            System.out.println(x[i]);
        }
        
        System.out.print("검색할 값: "); //key값 입력
        int ky = input.nextInt();
        
        int idx = SeqSearchSen(x, num, ky); //배열 x에서 값이 ky인 요소 검색
        
        if (idx == -1)
            System.out.println("그런거 없다");
        else
            System.out.println(ky+"은(는) x[" + idx + "] 에 있다.");
    }
}
