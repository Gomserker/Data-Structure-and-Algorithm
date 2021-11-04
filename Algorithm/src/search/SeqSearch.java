package search;

import java.util.Scanner;

public class SeqSearch {
/*
 Linear Search(선형 검색) aka. sequential search(순차 검색)
 */
    static int seqSearch(int[] a, int n, int key) {
//  요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색
        int i = 0;
        
        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }
//    for문으로 만들면 공간복잡도를 조금 더 낮출 수 있다.
class SeqSearchFor {
    int seqSearchFor(int[] a, int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("요솟수: ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = (int) (Math.random() * 100);
            System.out.println(x[i]);
        }
        
        
        System.out.print("검색할 값: ");
        int ky = input.nextInt();
        int idx = seqSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("그런거 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "] 에 있습니다.");
    }

}
