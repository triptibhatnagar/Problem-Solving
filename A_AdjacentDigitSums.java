import java.util.Scanner;

public class A_AdjacentDigitSums {
    // n = possible answer
    static void isPossible(int x, int y) {
        // if n's last digit is not 9, eg - n=16, n+1 = 17, x=7, y=8 -> y = x+1
        // if n's last digit is 9, eg - n=19, n+1 = 20, x=10, y=2 -> y < x
        
        // difference b/w x and y
        // n = 9, n+1 = 10, x = 9, y=1, x-y = 8 (9*1-1)
        // n = 9999, n+1 = 10000, x = 36, y=1, x-y = 35 (9*4-1)
        // x-y = 9*k-1 to be possible
        if(y == x+1) {
            System.out.println("YES");
        }else if(x < y) {
            System.out.println("NO");
        }else {
            if((x-y+1)%9 == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            isPossible(x,y);
            t--;
        }
        sc.close();
    }
}