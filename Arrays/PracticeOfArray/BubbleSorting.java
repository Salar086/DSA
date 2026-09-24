package PracticeOfArray;

public class BubbleSorting {
    public static void main(String[] args) {   
    int [] arr={23,45,32,1,24,2,43,12,10,31};
    System.out.println("the Original Array : ");
    for (int num: arr){
        System.out.println(num);
    }

    //Bubble Sorting .
    for(int i=1;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println("sorted List :");
    for(int num: arr){
        System.out.println(num);
    }
}
}
