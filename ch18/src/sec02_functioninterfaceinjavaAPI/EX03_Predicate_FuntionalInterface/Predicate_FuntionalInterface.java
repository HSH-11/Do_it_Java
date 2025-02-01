package sec02_functioninterfaceinjavaAPI.EX03_Predicate_FuntionalInterface;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Predicate_FuntionalInterface {
	public static void main(String[] args) {

		//#1. �͸��̳�Ŭ���� ������� ��ü ����
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {				
				return (t.length()>0)? true:false;
			}
		};
		System.out.println(p.test("�ȳ�")); //true
		
		//#2. Predicate<T>�� ���ٽ� ǥ��
		//@1. ǥ���� Predicate<T>
		Predicate<String> p1 = (str)->(str.length()>0?true:false);
		System.out.println(p1.test("�ȳ�")); //true
		System.out.println();
		
		//@2. Ȯ���� Predicate
		IntPredicate p2 = (num)->(num%2)==0?true:false;
		LongPredicate p3 = (num)->(num>100)?true:false;
		DoublePredicate p4 = (num)->(num>0)?true:false;
		BiPredicate<String, String> p5 = (str1, str2)->str1.equals(str2);
		
		System.out.println(p2.test(2)); //true
		System.out.println(p3.test(85L)); //false
		System.out.println(p4.test(-5.8)); //false
		System.out.println(p5.test("�ȳ�", "�ȳ�")); //true		
		
	}
}
