package sec01_operator_1.EX02_BitwiseOperator;

public class BitwiseOperator {
	public static void main(String[] args) {
		//#0. 자바코드로 진법 변환
		int data =13;
        System.out.println(Integer.toBinaryString(data)); //1101
        System.out.println(Integer.toOctalString(data)); //15
        System.out.println(Integer.toHexString(data)); //d
        System.out.println();
        
        System.out.println(Integer.parseInt("1101", 2)); //13
        System.out.println(Integer.parseInt("15", 8)); //13
        System.out.println(Integer.parseInt("0D", 16)); //13
        System.out.println();
        
        //#1. 다양한 진법 표현
        System.out.println(13); //13
        System.out.println(0b1101); //13
        System.out.println(015); //13
        System.out.println(0x0D); //13
        System.out.println();
        
        //#2. 비트연산자
        //@AND 비트연산자
        System.out.println(3 & 10); //2
        System.out.println(0b0011 & 0b1010); //0b0010 --> 2
        System.out.println(0x03 & 0x0A); //2
        System.out.println();
        
        //@OR 비트연산자
        System.out.println(3 | 10); //11
        System.out.println(0b0011 | 0b1010); //0b1011 --> 11
        System.out.println(0x03 | 0x0A); //11
        System.out.println();
        
        //@XOR 비트연산자
        System.out.println(3 ^ 10); //9
        System.out.println(0b0011 ^ 0b1010); //0b1001 --> 9
        System.out.println(0x03 ^ 0x0A); //9
        System.out.println();

        //@NOT 비트연산자
        System.out.println(~3); //-4
        System.out.println(~0b0011); //0b1111...1100 -> -4
        System.out.println(~0x03); //-4
        
        /*음수 값을 읽을 때 0을 기준으로 읽은 후 왜 1을 더할까?
          A. 1을 더하지 않으면 음수에서 양수로 넘어가는 과정에서 10진수 0을 나타내는 표현이 2개 존재하게 되므로
          이를 방지하기 위해 0을 기준으로 읽은 후 1을 더하여 양수가 되는 과정에서 10진수 0을 표현하는 값이 1개만 존재하도록 한다.*/
	}
}
