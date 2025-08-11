class Fib {
    public static int fib(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // f(n) = f(n-1) + f(n-2)
        int t1 = fib(n - 1);
        int t2 = fib(n - 2);
        return t1 + t2;
    }

    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}