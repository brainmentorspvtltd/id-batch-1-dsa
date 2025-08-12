class DiceGame {

    static void printPos(int start, int end, String result) {
        if (start == end) {
            System.out.print(result + ",");
            return;
        }
        if (start > end) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            printPos(start + dice, end, result + dice);
        }
        // printPos(start + 1, end, result + 1);
        // printPos(start + 2, end, result + 2);
        // printPos(start + 3, end, result + 3);
        // printPos(start + 4, end, result + 4);
        // printPos(start + 5, end, result + 5);
        // printPos(start + 6, end, result + 6);
    }

    public static void main(String[] args) {
        printPos(0, 100, "");
    }
}