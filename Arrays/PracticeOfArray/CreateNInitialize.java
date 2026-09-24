package PracticeOfArray;

public class CreateNInitialize {
    
    public static void main(String[] args) {
        int[] arr = new int[5]; // Create an array of size 5
        // Initialize the array with values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int[] arr2 = new int  [5]; // Create and initialize an array in one line
        for(int i=0; i<arr2.length; i++){
            arr2[i] = (i+6)*10;
        }
        //printing the elements of the first array
        System.out.println("Elements of the first array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        //printing the elements of the second array
        System.out.println("\nElements of the second array:");
        for(int num : arr2){
            System.out.print(num + " ");
        }

        //printing the elements of the both arrays in one line
        System.out.println("\nElements of both arrays:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
            
        }
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
