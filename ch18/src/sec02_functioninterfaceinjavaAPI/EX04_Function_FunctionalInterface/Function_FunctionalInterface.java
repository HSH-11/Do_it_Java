package sec02_functioninterfaceinjavaAPI.EX04_Function_FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Function_FunctionalInterface {
	public static void main(String[] args) {
		
		//#1. �͸��̳�Ŭ���� ������� ��ü ����
		Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {				
				return t.length();
			}
		};
		System.out.println(f.apply("�ȳ�"));//2
		
		//#2. Function<T, R> ���ٽ� ǥ��
		//@1. ǥ���� 
		Function<String, Integer> f1 = str-> str.length();
		System.out.println(f1.apply("�ȳ�"));//2
		
		//@2-1. Ȯ���� (�Է�(T)�� ����)
		IntFunction<Double> f2 = (num)->(double)num;; //int->double
		LongFunction<String> f3 = (num)->String.valueOf(num); //long->String
		DoubleFunction<Integer> f4 = (num)->(int)num;; //double->int
		BiFunction<String, Integer, String> f5 = (name, age)->"�̸��� = " + name + " ���̴� = "+ age; //String, Integer->String
		
		System.out.println(f2.apply(10)); //10.0
		System.out.println(f3.apply(20L)); //20
		System.out.println(f4.apply(30.5)); //30
		System.out.println(f5.apply("ȫ�浿", 16)); //�̸��� = ȫ�浿 ���̴� = 16 
		System.out.println();
		
		//@2-2. Ȯ���� (���(R)�� ����)
		ToIntFunction<String> f6 = (str)->str.length(); //String->int
		ToLongFunction<Double> f7 = (num)->num.longValue(); //double->long
		ToDoubleFunction<Integer> f8 = (num)->num/100.0; //Integer->double
		System.out.println(f6.applyAsInt("�ݰ����ϴ�")); //5
		System.out.println(f7.applyAsLong(58.254)); //58
		System.out.println(f8.applyAsDouble(250)); //2.5		
	}
}