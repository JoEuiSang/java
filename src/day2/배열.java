package day2;

public class �迭 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        for (int i =0; i<arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }

        //forEach ����
        for (int value:arr){
            System.out.println(value);
        }

    }
}
