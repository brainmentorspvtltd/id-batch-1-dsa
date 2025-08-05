public class EvenOdd {

    static int[] countEvenOdd(int n) {
        if (n == 0) {
            int arr[] = new int[2];
            // [0] = even
            // [1] = odd
            return arr;
        }

        // [0] - even [1] -odd
        int arr[] = countEvenOdd(n - 1);
        // BackTrack
        if (n % 2 == 0) {
            arr[0]++;
        } else {
            arr[1]++;
        }
        return arr;
    }

    static void countEvenOdd(int n, int even, int odd) {
        // Base case
        if (n == 0) {
            System.out.println("Even " + even + " Odd " + odd);
            return;
        }
        if (n % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        countEvenOdd(n - 1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);
    }
}
