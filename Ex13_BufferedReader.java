package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		//����, Error
		//- ����, ����(Bug), ����(Exception) ��
		
		//1. ������ ����
		// - �������� �� �߻��ϴ� ����
		// - �ҽ� �ڵ� -> ����(Machine Code), �����ڵ�(Binary Code)
		// - �����Ϸ��� ������ �Ҷ� ������ �ùٸ��� Ȯ���ϴ� �������� �߰�
		// - ������ �۾��� �ߴ�(���� ����)
	    // - ���̵� ���� ���� -> �߰� ���� -> ��ġ�� ����
		// - �����Ϸ��� � ������ �߻��ߴ����� �˷��ش�
		// - ��Ÿ
		
		int a= 10; 
		
		
		//2. ��Ÿ�� ����
		// -
		// - ������ �۾����� �߰��� �ȵƴµ� ���� �߿� �߰� �Ǵ� ����
		// - ����(Exception)
		// - �߰� ���̵� �߱�. ���Һ�
		// - ��� ����� ���� �̸� �����ؼ� �׽�Ʈ�� �ؾ� �Ѵ�. -> ��Ե� �̸� �߰�!!
		// - 1. ����� ����
		// - 2. ���α׷� (�׽�Ʈ�� ���α׷�)
		
		//����� �Է� ->���� �Է� -> ���� -> ��� ���
		int num = 0;
		//System.out.println(100 / num);
		
		
		//3. �� ����
		// - ������ Ʋ������ ����, ���൵ �ߵǴµ� .....? ����� �̻���???
		// - �߰� ����. ���� ���̵� ����
		
		// �䱸����] ������� �¾ �⵵�� �Է¹޾� ���̸� ����Ͻÿ�.
		
		System.out.print("���� �Է�(ex.1995): ");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		int year = Integer.parseInt(data);
	    
		
		int age = 2020 - year;
		System.out.printf("%d����� ���� %d�� �Դϴ�.", year, age +1);
		
		
		//readLine() �޼ҵ�� ��� �Է� �����Ͱ� ���ڿ�(String)�� ��ȯ�ȴ�.
		// -> �Էµ� ���ڿ�(String)�� �ٸ� �ڷ������� �ٲٴ� ���
		
		//"���ڿ�" -> byte: Byte.parseByte("10")
		//"���ڿ�" -> short: Short.parseShort("10")
		//"���ڿ�" -> int: Integer.parseInt("10")
		//"���ڿ�" -> long: Long.parseLong("10")
		
		//"���ڿ�" -> float : Float.parseFloat("3.14")
		//"���ڿ�" -> double: Double.parseDouble("3.14")
		
		//"���ڿ�" -> boolean : Boolean.parseBoolean("true")
		
	    char c1 = 'A';
	    String c2 = "A";
	    
	    //"A" -> 'A'.charAt(0)
	    
	    
	    
		
	}

}
