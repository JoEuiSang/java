package day2;

public class ArrayExam {

	public static void main(String[] args) {
		int[][] arr[][];
		int[] iarr[];
		int[][] iarr2;
		int iarr3[][];

		int[][] iarr4 = new int[3][2];
		iarr4[0][1]=10;
		
		System.out.println(iarr4[0][1]);
		
		int[][] iarr5 = new int[3][];
//		iarr5[0][1] = 10;  에러 발생 nullPointer
		
		iarr5[0] = new int[5];
		iarr5[1] = new int[2];
		iarr5[2] = new int[1];
		
				
		String str = null;
//		str.charAt(0);		에러 발생
		
		int[][] iarr6 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] i:iarr6) {
			for(int j:i)
			System.out.print(j);
		}
		
		
		
		
		
	}

}
