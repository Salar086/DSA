public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 70, 90, 60, 30, 50, 80};
        int elementToSearch = 40;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Element not found in the array.");
        }
    }
}