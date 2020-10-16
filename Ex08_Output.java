package com.test.java;

public class Ex08_Output {
	
	public static void main(String[] args) {
		
		//�ܼ� ���
		// - ����� ���
		// - �ڹٿ��� ����ڿ���
		
		//�ܼ� ��� ��ɾ� 
		//1.System.out.println(); �޼���
		// - System: Ŭ����
		// - out: �ʵ�
		// - println
		
		int num = 100;
		String name = "ȫ�浿";
		
		//�ܼ� ���
		//1. 
		System.out.println(num);//���� ���
		System.out.println(name);
		
		System.out.println(200);//��� ���
		System.out.println("�ƹ���");
		
	    System.out.println(10 + 20); //���� ��� ���
	    
	    //2. print
	    System.out.print(num);
	    System.out.println(name);
	    
	    name = "ȫ�浿";
	    
	    int kor = 90;
	    int eng = 80;
	    int math =70;
	    int total = kor + eng + math; //����
	    
	    System.out.println("[" + name + " ����ǥ]");
	    System.out.println("[����]\t[����]\t[����]");
	   
	    System.out.print(kor);
	    System.out.print("\t");
	    System.out.print(eng);
	    System.out.print("\t");
	    System.out.print(math);
        System.out.print("\t");
	    System.out.print("\n");
	    
	    System.out.print(kor + "\t");
	    System.out.print(eng + "\t");
	    System.out.print(math + "\t");
        
        System.out.println(kor + "\t" + eng + "\t" +math);
        System.out.println("����: 240��");
	    System.out.print(total);
	    
	    System.out.println();
	    System.out.println();
	    
	    //3.printf
	    // - print format
	    // - ������ ���缭 ����ϴµ� ���� �޼���
	    
	    // �䱸����] �ȳ��ϼ���. ȫ�浿�� -> ���
	    name = "�ƹ���";
	    System.out.println("�ȳ��ϼ���. " + name + "��");
	    
     	// �䱸����] �ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��. -> �߰� ���
	    System.out.println("�ȳ��ϼ���. " + name + "��. �ݰ����ϴ�. " + name + "��.");
	    
	    //�����ڴ� �ڵ带 �ۼ� -> ���� ���� X -> �̷� ���� O
	    // -> ���� ��������(����)
	    System.out.println("�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿��.");
	    
	    //printf
	    // - ���� ���ڿ� ���
	    //1. %s : String
	    //2. %d : Decimal(Byte, Short, int, long)
	    //3. %f : Float(float, double)
	    //4. %c : Char
	    //5. %d : Boolean
	    //6. %n : New Line
	    name = "ȫ�浿";
	    System.out.println("�ȳ��ϼ��� " + name + "��.");
	    System.out.printf("�ȳ��ϼ���. %s��. \n",name);
	    
	    //�䱸����]�ȳ��ϼ���. ȫ�浿��. �ݰ����ϴ�. ȫ�浿�� -> �߰� ���
	    System.out.printf("�ȳ��ϼ���. %s��. �ݰ����ϴ�. %s��", name, name);
	    
	    //Oracle > SQL ���� 
	    //insert into tblMenber(seq, name, age, address, tel) values(1, 'ȫ�浿', 20, '����� ������', '010-1234-5678')
	    
	    String seq = "1";
	    name ="ȫ�浿";
	    String age ="20";
	    String address = "����� ������";
	    String tel = "010-1234-5678";
	    
	    String sql ="insert into tblMenber(seq, name, age, address, tel) values("+ seq + ", '" +name+ "'," + age+ ", '"+ address +"', '"+tel+"')";	    
	    
	    
	    //printf
	    
	    System.out.printf("into tblMenber(seq, name, age, address, tel)" + "values (%s, '%s', %s, '%s','%s',)", seq, name, age, address, tel);
	    
	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.printf("���ڿ� : %s\n", "ȫ�浿");
	    System.out.printf("���� : %d\n", 100);
	    
	    int a =10;
	    int b =20;
	    
	    System.out.printf("%d + %d = %d\n", a, b, a+b);
	    
	    //���� ���� �߰� ���
	    //1. %����d
	    // - ��� �ڸ��� ����
	    // - +(��������)
	    // - -(���� ����)
	    // - %d, %s, %f, %c, %b ��� ��� ���� 
	    
	    //Ctrl + Alt +����Ű (��, �Ʒ�)
	    
	    //Alt + ����Ű (��, �Ʒ�)
	   
	    
	    //2. %,d
	    // -õ���� ǥ�� (3�ڸ����� ',' ���)
	    
//	    System.out.printf("�����ٶ�%���ٻ�", 10);
//	    System.out.printf("�����ٶ�%10d���ٻ�", 10);
//	    System.out.printf("�����ٶ�%5d���ٻ�", 10);
//	    System.out.printf("�����ٶ�%-10d���ٻ�", 10);
	    
	    System.out.println();
		System.out.println("======================");
		System.out.println("���� ����(����: ��)");
		System.out.println("======================");
		System.out.printf("1. �ݶ�:\t %,5d\n", 2500);
		System.out.printf("2. ������:\t %,5d\n", 4500);
	    System.out.printf("3. ��ī��:\t %,5d\n", 500);
	    System.out.printf("4. �Ƹ޸�ī��:\t %,5d\n", 2000);
	    
	    
	    System.out.println();
	    
	    double pi =3.14;
	    
	    System.out.printf("���� : %f\n", pi);
	    System.out.printf("���� : %.1f\n", pi);
	    System.out.printf("���� : %.2f\n", pi);
	    System.out.printf("���� : %.3f\n", pi);
	    System.out.printf("���� : %.0f\n", pi);
	    
	    
	}

}
