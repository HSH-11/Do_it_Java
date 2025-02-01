package sec02_functioninterfaceinjavaAPI.EX02_Suppler_FuntionalInterface;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Suppler_FuntionalInterface {
	public static void main(String[] args) {
		
		//#1. �͸��̳�Ŭ���� ��� ��ü ����
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {				
				return "Supplier<T> �Լ��� �������̽�";
			}
		};
		System.out.println(s.get()); //Supplier<T> �Լ��� �������̽�
		
		//#2. Supplier<T> �Լ��� �������̽�
		//@1. ǥ����		
		Supplier<String> s1 = ()-> "Supplier<T> �Լ��� �������̽�";
		System.out.println(s1.get()); //Supplier<T> �Լ��� �������̽�
		
		//@2. Ȯ����
		BooleanSupplier s2 = ()->false;
		IntSupplier s3 = ()->2+3;
		LongSupplier s4 = ()->10L;
		DoubleSupplier s5 = ()->5.8;
		System.out.println(s2.getAsBoolean()); //false
		System.out.println(s3.getAsInt()); //5
		System.out.println(s4.getAsLong()); //10
		System.out.println(s5.getAsDouble()); //5.8
		
	}
}