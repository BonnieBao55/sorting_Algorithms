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

        BubbleSort(arr);

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
            if (leftArrIndex < leftArraySize && rightArrIndex < rightArraySize){
                array[mainIndex++] = leftArray[leftArrIndex++];
                mainIndex++;
                leftArrIndex++;
            }
            else{
                array[mainIndex] = rightArray[rightArrIndex];
                mainIndex++;
                rightArrIndex++;
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
        
    
}