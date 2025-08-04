public class NamePrint {

    static void show(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // System.out.println("Amit " + n); // Pre Logic
        show(n - 1); // n-1 RR
        // Post Logic - BackTracking
        System.out.println("Srivastava " + n);
    }

    public static void main(String[] args) {
        show(5);
    }
}
