public class BubbleSortingOfArray {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int temp;
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //function to perform bubble sort
        
        for(int i=1;i<arr.length;i++){   // this loop is for number of passes which r length-1.
          
            for(int j=0;j<arr.length-1;j++){ // this loop is for comparison of elements in each pass
               
                /*  we use -1 here bcz in the end we compare [5] with [6] and if 
                 we use arr.length then it will give us error as there is no [7] 
                 index in the array.
                */
               
                if(arr[j]>arr[j+1]) {    //[j+1] bcz we are comparing the current element with the next element
                    
                    // Swap arr[j] and arr[j+1]
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
               
                }
            }
       
        }

        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

    
