public class Max {
    // return the max number
    static int max(int arr[], int index) {
        if (arr.length == index) {
            return Integer.MIN_VALUE;
        }
        int m = max(arr, index + 1); // Traverse
        if (arr[index] > m) {
            m = arr[index];
        }
        return m;
    }

    public static void main(String[] args) {
        int arr[] = { 90, 100, 8, 50, 88, 66 };
        int r = max(arr, 0);
        System.out.println("Max is " + r);
    }
}
