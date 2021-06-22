class ConvertToBinary {


    // Recursive function to convert n
    // to its binary equivalent
    static void decimalToBinary(int n) {
        try {
            // Base case
            if (n == 0) {
                System.out.print("0");
                return;
            }
            //     if(n<0)
            //     {
            // System.out.print("number is negative");
            //         return;
            //     }


            // Recursive call
            decimalToBinary(n / 2);
            System.out.print(n % 2);
        }
    } catch (Exception e) {
        System.out.println("Exception : " +  e);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 13;

        decimalToBinary(n);
    }
}
