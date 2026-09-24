package PracticeOfArray;

public class EvenNOdd {
    public static void main(String[] args){
        int [] arr ={1,23,23,67,65,43,66,89,565,333,22,44,12,34,56,78,90,100};
      
        System.out.println("Elements of the array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Even elements in the array:");
      for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.println(arr[i]);
        }
      }
        System.out.println("Odd elements in the array:");
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            System.out.println(arr[i]);
       }
        }
    }
    
}
