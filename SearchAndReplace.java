public class SearchAndReplace {

    static String searchAndReplace(String str,
            char search, char replace) {
        if (str.length() == 0) {
            return "";
        }
        String old = searchAndReplace(str.substring(1), search, replace);
        char firstChar = str.charAt(0);
        if (firstChar == search) {
            return replace + old;
        } else {
            return firstChar + old;
        }
    }

    public static void main(String[] args) {
        String r = searchAndReplace("Hello",
                'l', 'x');
        System.out.println(r);

    }
}
