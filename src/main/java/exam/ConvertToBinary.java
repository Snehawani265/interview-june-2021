import java.util.*;
import java.util.Scanner.*;
class ConvertToBinary {
    static int decimalToBinary(int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("value must be non-negative");
            } else if (n == 0) {
                System.out.println("NUMBER :" + n);
                System.out.print("0");
                return 0;
            }
            decimalToBinary(n / 2);
            System.out.print(n % 2);
        } catch (IllegalArgumentException i) {
            System.out.println("Exception : " + i);
        } return 0;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        n = sc.nextInt();
        decimalToBinary(n);
    }
}
