import java.util.Scanner;

public class SomeImp {
    public static void main(String[] args) {
        // -----Fibinacci Number----
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while (count <= n) {
        // int temp = b;
        // b = b + a;
        // a = temp;
        // count++;

        // System.out.println(b);
        // }

        // -----Check How many timea digit present in one number
        // System.out.println("Enter Your Number");
        // Scanner num = new Scanner(System.in);
        // int n = num.nextInt();
        // System.out.println("Enter Frequency check number");
        // int num1 = num.nextInt();
        // int count = 0;

        // while (n > 0) {
        // int rem = n % 10;
        // if (rem == num1) {
        // count++;
        // }
        // n = n / 10;
        // }
        // System.out.println(count);

        // -------Reverse The num-------
        System.out.println("Enter Your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }

}
