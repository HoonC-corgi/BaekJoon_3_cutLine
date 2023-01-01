import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;    // 응시자 수
        int k;    // 수상자 수
        int max=0;
        int score[];    // 응시자 점수를 저장할 배열

        n=scanner.nextInt();
        k=scanner.nextInt();

        score = new int[n+1];

        for(int i=0; i<n; i++) {
            score[i]=scanner.nextInt();
        }

        for(int j=n; j>0; j--) {
            for (int i = 0; i < n; i++) {
                if (score[i] < score[i + 1]) {
                    int sc = score[i + 1];
                    score[i + 1] = score[i];
                    score[i] = sc;
                }
            }
        }

        System.out.println(score[k-1]);
    }
}
