package BitManipulation;

public class SetKtBit {
    public static void main(String[] args) {
        int n = 10; // Binary: 1010
        int k = 2;  // Set the 2nd bit (0-indexed)

        // To set the k-th bit, we use the OR operator with (1 << k)
        int result = n | (1 << k);

        System.out.println("Original number: " + n);
        System.out.println("Number after setting " + k + "-th bit: " + result);
        System.out.println("Binary representation: " + Integer.toBinaryString(result));
    }

}
