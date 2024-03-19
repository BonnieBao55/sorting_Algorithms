/**
 * Project
 */
public class Project {


    public static void main(String[] args) {
        int[]arr = {3,54,21,1,58,89,87,1000,2};

        for(int value : arr){
            System.out.print(" " + value);
        }

        BubbleSort(arr);

        System.out.println(arr);

        for(int value : arr){
            System.out.print(" " + value);
        }
        
    }

    public static void BubbleSort(int[]arr){
        int temp;
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length -1; j++){
                // swapping 
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //public static void swap() 
}