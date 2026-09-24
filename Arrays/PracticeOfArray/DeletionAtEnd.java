package PracticeOfArray;

public class DeletionAtEnd {
    public static void main(String[] args) {
        
     int [] arr={10,332,12,34,56,788,54,32,11,14,89};
     System.out.println("Original array : ");
     for(int num : arr){
        System.out.println(num);
     }

     System.out.println("after Deletion : ");
     for(int i=0; i<arr.length;i++){
        if(arr[i]==arr[arr.length-1]){
            continue;
        }
        System.out.println(arr[i]);
     }

    }
}
