class Reverse {
    static String reverse(String str) {
        // base case
        if (str.length() == 0) {
            return "";
        }
        // make the string small
        String small = str.substring(1);
        String old = reverse(small);
        return old + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("amit"));
    }
}