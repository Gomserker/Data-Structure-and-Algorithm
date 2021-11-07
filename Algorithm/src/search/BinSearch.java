package search;

import java.util.Scanner;


/*
 pl = "검색 범위"의 맨 앞 인덱스
 pr = "검색 범위"의 맨 뒤 인덱스
 pc = "검색 범위"의 중앙 인덱스
 */
public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        
        do {
            int pc = (pl + pr) / 2; //중앙 요소의 인덱스
            if (a[pc] == key)
                return pc; //찾으면 반환
            else if (a[pc] < key)
                pl = pc + 1; //중간인덱스가 찾는 값보다 작으면 검색 범위를 뒤쪽 절반으로 좁힌다.
            else
                pr = pc - 1; //중간 인덱스가 찾는 값보다 크면 검색 범위를 앞쪽 절반으로 좁힌다.
        } while (pl <= pr); //pl이 pr보다 작거나 같을때까지
        
        return -1; //찾는 값이 없으면(검색 실패) -1 반환.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("요솟수 : ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        System.out.println("오름차순으로 입력하세요.");
        /*
         Q : 왜 오름차순(또는 내림차순)으로 정렬을 시키는가?
         A : 이진 검색(binary Search)을 실행하려면 요소들이 반드시 정렬되어 있어야한다.
         */
        System.out.print("x[0] : ");
        x[0] = input.nextInt();
        
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = input.nextInt();
            } while (x[i] < x[i - 1]); // x[i]가 x[i - 1]보다 작으면 다시 입력시킨다.
        }
        
        System.out.print("검색할 값 : ");
        int ky = input.nextInt();
        
        int idx = binSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("그런거 없다");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}
