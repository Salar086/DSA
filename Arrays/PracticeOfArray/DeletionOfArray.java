package PracticeOfArray;

public class DeletionOfArray {
    public static void main(String[] args) {
        
    
    int [] arr= {12,34,11,233,455,322,123,21,23,34,56,78};
    for(int num: arr){
        System.out.println(num);
    }
    int indexno=4;

    
    int[] arr1= new int [arr.length-1];

    int j=0;
    for(int i=0;i<arr1.length;i++){
        if(i==indexno){
            continue;
        }
        arr1[j]=arr[i];
        j++;

    }

    System.out.println("after deletion : ");
    for(int num1: arr1){
        System.out.println(num1);
    }
}
}
