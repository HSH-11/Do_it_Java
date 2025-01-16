package sec01_operator_1.EX03_ShiftOperator;

public class ShiftOperator {
	public static void main(String[] args) {
		//#1.산술쉬프트(부호변화가 없음 *2, /2 효과)
		//@ << Left shift
		System.out.println(3<<1); //6
        System.out.println(-3<<1);//-6
        System.out.println(3<<2); //12
        System.out.println(-3<<2);//-12
        System.out.println();
        
        //@ >> Right shift
        // 양수: 소수 버림, 음수: 소수 올림
        System.out.println(5>>1); //2
        System.out.println(-5>>1);//-3
        System.out.println(5>>2); //1
        System.out.println(-5>>2);//-2
        System.out.println();
        
        //#2. 논리쉬프트 (>>>)
        System.out.println(3>>>1); //0000...0011 = 1
        System.out.println(-3>>>31); //1111...1101 = 1 31번째 비트값
	}
}
