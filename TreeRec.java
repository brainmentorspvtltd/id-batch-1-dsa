public class TreeRec {

    static void tree(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Pre Call " + n); // Stack Build
        tree(n - 1);
        System.out.println("In BW Call " + n); // BackTrack n-1
        tree(n - 2);
        System.out.println("Post Call " + n);
    }

    public static void main(String[] args) {
        tree(5);
    }
}
