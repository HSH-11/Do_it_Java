package sec02_primarydatatype.EX05_TypeCasting_2;

public class TypeCasting_2 {
	public static void main(String[] args) {
		// 자료형 크기 : byte < short/char < int < long < float < double 
		//#1. 자동타입변환 (업캐스팅 + byte/short 자료형 데이터 입력)
        float value1 = 3;	//int -> float (업캐스팅)
        long value2 = 5;	//int -> long (업캐스팅)
        double value3 = 7;	//int -> double (업캐스팅)
        byte value4 = 9; 	//(예외: int -> byte)
        short value5 = 11;	//(예외: int -> short)
        
        System.out.println(value1); 
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println();
        
        //#2. 수동 타입변환
        byte value6 = (byte)128; 	//int -> byte (다운캐스팅)
        int value7 = (int)3.5;   	//double -> int (다운캐스팅)
        float value8 = (float)7.5;	//double -> float (다운캐스팅)
        // byte value9 = (byte)-129; 127로 출력 
        // byte value10 = (byte)129; -127로 출력
        System.out.println(value6); //-128 정수형을 타입 변환할 때 나타나는 서큘러 구조로 인해 -128로 변환
        System.out.println(value7);
        System.out.println(value8);
        System.out.println();
        
        //오차 발생 확인
        double a  = 7.000000005;
        System.out.println(a);
        float b = (float)7.000000005;
        System.out.println(b);
	}
}
