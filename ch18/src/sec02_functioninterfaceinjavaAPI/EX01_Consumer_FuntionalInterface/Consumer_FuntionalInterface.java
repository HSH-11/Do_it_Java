package sec02_functioninterfaceinjavaAPI.EX01_Consumer_FuntionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class Consumer_FuntionalInterface {
	public static void main(String[] args) {

		//#1. �͸��̳�Ŭ������ �̿��� ��ü ����
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);	
			}
		};
		
		//#2. ���ٽ� ǥ��
		//@1. ǥ�� Consumer
		Consumer<String> c1 = t->System.out.println(t);
		c1.accept("Consumer<T> �Լ��� �������̽�");
		
		//@2. Ȯ���� Consumer
		IntConsumer c2 = num->System.out.println("int ��="+num);
		LongConsumer c3 = num->System.out.println("long ��="+num);
		DoubleConsumer c4 = num->System.out.println("double ��="+num);
		BiConsumer<String, Integer> c5 = (name, age)->System.out.println("�̸�="+name + " ����="+age);
		
		c2.accept(5);
		c3.accept(5L);
		c4.accept(7.8);
		c5.accept("ȫ�浿", 16);				
	}
}