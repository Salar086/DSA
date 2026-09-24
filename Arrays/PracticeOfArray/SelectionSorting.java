package PracticeOfArray;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr= {10,1,43,21,3,32,1,23,4,578,9,31,2};
        System.out.println("original Array : ");
        for(int num: arr){
            System.out.println(num);
        }

        
        int temp;

        //Selection Soorting .
        for(int i=0;i<arr.length ;i++){
            int min = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){  //this is rn in ascending order . but, if we want to change it in descennding we js change the sign og greater than .
                    min = j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        System.out.println("Sorted Array : ");
        for(int num1: arr){
            System.out.println(num1);
        }
    }
}
