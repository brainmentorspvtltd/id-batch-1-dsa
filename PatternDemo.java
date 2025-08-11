class PatternDemo {
    static void printStar(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("*");
        printStar(star - 1);
    }

    static void pattern1(int row) {
        if (row == 0) {
            return;
        }
        printStar(row);
        System.out.println();
        pattern1(row - 1);
        // BackTrack
        // printStar(row);
        // System.out.println();
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}