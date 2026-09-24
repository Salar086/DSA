public class TraversalOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Traversing the array using a for loop
        System.out.println("Traversing the array using a for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Traversing the array using an enhanced for loop
        System.out.println("Traversing the array using an enhanced for loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Traversing the array using a while loop
        System.out.println("Traversing the array using a while loop:");
        int i= 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
