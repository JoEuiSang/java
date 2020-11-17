package day2;

public class 배열 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        for (int i =0; i<arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }

        //forEach 구문
        for (int value:arr){
            System.out.println(value);
        }

    }
}
