package sec02_set.EX06_SetSummay;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSummay {
	public static void main(String[] args) {
	
		//#1. HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		System.out.println(hashSet.toString()); //[��, ��, ��, ��]
		
		//#2. LinkedHashSet (�Է� ���� �ݿ�)
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		System.out.println(linkedHashSet.toString()); //[�� �� �� ��]
		
		//#3. TreeSet (ũ�� ��)
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		System.out.println(treeSet.toString()); //[�� �� �� ��]
	}
}