package sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		int[] array = new int[] {3,4,5,6,7};
		
		// 배열 길이 구하기
		System.out.println(array.length);
		
		//출력 방법 1
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//출력 방법 2
		for(int k: array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//출력 방법 3
		System.out.println(Arrays.toString(array));
	}

}
