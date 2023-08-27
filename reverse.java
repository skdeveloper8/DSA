package arrays;

public class reverse {
    static void solution(int arr[]) {
        int end = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        solution(arr);

    }

}
