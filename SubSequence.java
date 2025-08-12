public class SubSequence {
    static void subSeq(String str, String result) {
        // base case
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        // Pick it
        subSeq(str.substring(1), result + str.charAt(0));
        // Not Pick It
        subSeq(str.substring(1), result);
    }

    public static void main(String[] args) {
        Object a = 10;
        a = "Amit";
        a = 10.20;
        a = true;
        subSeq("amit", "");
    }
}
