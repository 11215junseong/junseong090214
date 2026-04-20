import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;      // 최댓값 저장
        int index = 0;    // 최댓값 위치 저장

        for (int i = 1; i <= 9; i++) { // 1부터 9까지 총 9번 반복
            int num = sc.nextInt();   // 숫자 입력받기

            if (num > max) { // 입력값이 현재 최댓값보다 크면
                max = num;   // 최댓값 갱신
                index = i;   // 위치 저장
            }
        }

        System.out.println(max);   // 최댓값 출력
        System.out.println(index); // 위치 출력
    }
}