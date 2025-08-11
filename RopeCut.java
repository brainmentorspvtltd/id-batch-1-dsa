public class RopeCut {

    static int maxP(int ropeLen, int a, int b, int c) {
        if (ropeLen == 0) {
            return 0;
        }
        if (ropeLen < 0) {
            return -1;
        }

        int option1 = maxP(ropeLen - a, a, b, c);
        int option2 = maxP(ropeLen - b, a, b, c);
        int option3 = maxP(ropeLen - c, a, b, c);
        int result = Math.max(option1, Math.max(option2, option3));
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        int max = maxP(5, 2, 5, 1);
        System.out.println("Max " + max);
    }
}
