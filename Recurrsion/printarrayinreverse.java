public class printarrayinreverse {

    public static void printinreverse(int[] a, int index) {
        if (index < 0) {
            return;
        }
        System.out.println(a[index]);
        printinreverse(a, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 43, 21, 334, 656, 89, 21};
        printinreverse(arr, arr.length - 1);  // start at the last index
    }
}