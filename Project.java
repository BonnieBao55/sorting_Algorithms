/**
 * Project
 */
public class Project {

    public static void main(String[] args) {
        int[]arr = {3,54,21,1,58,89,87,1000,2};

        long startTime = System.nanoTime();

        for(int value : arr){
            System.out.print(" " + value);
        }
        QuickSort(arr);

        //BubbleSort(arr);

        System.out.println(arr);

        for(int value : arr){
            System.out.print(" " + value);
        }

        // InsertionSort(arr);

        // System.out.println(arr);
        // for(int value : arr){
        // System.out.print(" " + value);
        // }    

        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println();
        System.out.println(elapsedNanos / 1000000);
    }

    public static void BubbleSort(int[]arr){
        int temp;
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length -1; j++){
                // swapping 
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[]arr){


        int minIndex, temp;
        for(int i = 0; i < arr.length -1; i++){
            minIndex = i;

            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

    }

     //public static void swap() 
}

    public static void InsertionSort(int[] arr){
        int temp, j;

        for (int i = 0; i < arr.length; i++){
            temp = arr[i];

            for (j = i; j > 0 && arr[j -1] > temp; ){
                //this look will move our elements to the right
                arr[j] = arr[j -1];
            }

            arr[j] = temp;
        }    
    }

    public static void MergeSort(int[] arr) {
        int length = arr.length;

        if(length <=1) return; 

        int middle = length / 2; 
        int []leftArray = new int[middle];
        int []rightArray = new int[length = middle];

        int l = 0; // index to keep track for out left array
        int r = 0; // index to keep track for out left array

        // populate the left and right arrays
        for(;l < length; l++){
            if (l < middle){
                leftArray[l] = arr[l];
            }else{
                rightArray[r] = arr[l];
                r++;
            }
            }

            MergeSort(leftArray);
            MergeSort(rightArray);

        }

        public static void Merge(int[] leftArray, int[] rightArray, int[] array) {
            int leftArraySize = leftArray.length;
            int rightArraySize = rightArray.length;

            int mainIndex = 0, leftArrIndex = 0, rightArrIndex = 0;

            //main condition for merge comparisons
            while (leftArrIndex < leftArraySize && rightArrIndex < rightArraySize){
                if(leftArray[leftArrIndex] < rightArray[rightArrIndex]){
                mainIndex++;
                leftArrIndex++;
            }
            else{
                array[mainIndex] = rightArray[rightArrIndex];
                mainIndex++;
                rightArrIndex++;
            }
        }


            while (leftArrIndex < leftArraySize){
                array[mainIndex] = leftArray[leftArrIndex];
                mainIndex++;
                leftArrIndex++;

            }

            while (rightArrIndex < rightArraySize){
                array[mainIndex] = rightArray[rightArrIndex];
                mainIndex++;
                rightArrIndex++;

            }



        }

    public static void  QuickSort(int[] arr) {
        RecursiveQuickSort(arr, 0, arr.length - 1);

    }


    /**
     * Will recursively call itself to perform Quick Sort operation
     * 
     * @param arr the array which should be sorted
     * @param low starting index for the current sub array being evaluated
     * @param high ending index for the current sub array being evaluated
     */
    public static void  RecursiveQuickSort(int[] arr, int low, int high) {
        //this is our condition that lets us know if we need to 
        //continue splitting into sub arrays

        if (low < high){
            int pivotIndex = Partition(arr, low, high);
            RecursiveQuickSort(arr, low, pivotIndex - 1);
            RecursiveQuickSort(arr, pivotIndex +1, high);

        }

    }       
    
public static int Partition(int[] arr, int low, int high){
    //choose our pivot
    int pivot = arr[high];

    int i = low - 1 ;

    /**
     * j will go through each of the elements in the current sub array being evaluated
     * it should start at low and end at high (inclusive)
     */

    for (int j = low; j <= high; j++ ) {
        if (arr[j] < pivot) {
            i++;
            //swap
            Swap (arr, i, j); 
        }
    }
    Swap (arr, i + 1, high); 
    return i + 1;

}
    public static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
}