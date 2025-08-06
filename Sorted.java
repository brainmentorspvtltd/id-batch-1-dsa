public class Sorted {

    static boolean isSorted(int arr[], int index) {
        // Base case
        if (arr.length - 1 == index) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 130, 40, 50 };
        System.out.println(isSorted(arr, 0)
                ? "Sorted"
                : "Not Sorted");
    }
}
