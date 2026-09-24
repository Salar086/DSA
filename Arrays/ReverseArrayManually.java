public class ReverseArrayManually {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start=0;
        int end= arr.length-1;

        System.out.println("Original array:");
        for(int num: arr ){
            System.out.print(num+" ");
        }
        System.out.println();

        // Reverse the array manually using a while loop
        while(start<end){
            // Swap arr[start] and arr[end]
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for(int num: arr ){
            System.out.print(num+" ");
        }
    }
}