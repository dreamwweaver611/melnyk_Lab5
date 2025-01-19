package Lab_5;

import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.swap;

public class Lab5 {

    public static void main (String[] args){
        float[] arr1 = {10.3F, 5, 25.43F, 30, 15};
      //  BubbleSort(arr1);
        System.out.print("Bubble Sort result: ");
        System.out.print(Arrays.toString(arr1));

        float[] arr2 = {10.3F, 5, 25.43F, 30, 15};
        InsertionSort(arr1);
        System.out.print("\nInsertion Sort result: ");
        System.out.println(Arrays.toString(arr1));

        BubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void InsertionSort(float[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j >= 1; j--){
                if(array[j]>array[j-1]){
                    float a = array[j];
                    array[j] = array[j-1];
                    array[j-1] = a;
                }
            }
        }
    }

    public static void BubbleSort(float[] array){
        for(int i = 0; i <= array.length; i++){
            for(int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    float a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
    }
}
