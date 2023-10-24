package day01;

public class Code04_bubbleSort {
    public static int[] bubbleSort(int[] arr) {
        //boundary condition
        if (arr == null || arr.length < 2) {
            return arr;
        }
        //0 ~ N-1
        //0 ~ N-2
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            // 0 1 1 2 2 3  end-1 end
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
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
        bubbleSort(arr);
        printArr(arr);
    }
}
