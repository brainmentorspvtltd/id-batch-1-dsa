public class Search {
    static int searchCount(int arr[], int index, int val) {
        if (arr.length == index) {
            return 0; // count
        }
        int count = searchCount(arr, index + 1, val);
        if (arr[index] == val) {
            count++;
        }
        return count;
    }

    static int search(int arr[], int index, int val) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == val) {
            return index;
        }
        return search(arr, index + 1, val);
    }

    public static void main(String[] args) {
        int arr[] = { 90, 100, 30, 88, 555, 100, 88, 77, 88 };
        int value = 188;
        System.out.println(searchCount(arr, 0, value));
        // int index = search(arr, 0, value);
        // System.out.println(index >= 0 ? "Found" : "Not Found");
    }
}
