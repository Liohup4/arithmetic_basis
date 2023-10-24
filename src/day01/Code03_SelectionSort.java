package day01;

public class Code03_SelectionSort {

    public static int[] SeletionSort(int[] arr) {
        //boundary condition
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int MinValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                MinValueIndex = arr[j] < arr[MinValueIndex] ? j : MinValueIndex;
            }
            swap(arr, i, MinValueIndex);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 8, 3, 4, 4, 6};
        printArr(arr);
        SeletionSort(arr);
        printArr(arr);
    }
}
