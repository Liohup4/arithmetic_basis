package day01;

public class Code05_InsertSort {
    public static int[] insertSort(int[] arr) {
        //boundary condition
        if (arr == null || arr.length < 2) {
            return arr;
        }
        //0 ~ N-1
        //0 ~ N-2
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumsIndex = end;
            while (newNumsIndex - 1 >= 0 && arr[newNumsIndex - 1] > arr[newNumsIndex]) {
                swap(arr, newNumsIndex - 1, newNumsIndex);
                newNumsIndex--;
            }
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
        insertSort(arr);
        printArr(arr);
    }
}
