import java.util.Scanner;

public class B_Race {
    static void isPossible(int a, int x, int y) {
        // assume x < y
        for(int b=1; b<=100; b++) {
            if(b == a) continue;
            if((Math.abs(x-b) < Math.abs(x-a)) && (Math.abs(y-b) < Math.abs(y-a))) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            isPossible(a, x, y);
            t--;
        }
        sc.close();
    }
}