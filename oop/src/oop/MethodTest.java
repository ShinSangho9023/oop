package oop;

public class MethodTest 
{

	public static void main(String[] args) 
	{
		Data d1 = new Data();
		Data d2 = new Data(10, 20);
		
		int i = new Data().sum(); 
		
		
		System.out.println(d1);
		System.out.println(d2);
		
		d2.print();
		System.out.println(d2.sum()); //30
		System.out.println(d1.sum()); //0
		System.out.println(Data.sum(5, 10)); //30// �׶����� ���� �޴� ���� ��Ȱ 
		// static �޼��带 Ȱ���� ��ü ������ ���ص� �Լ� ȣ�� ����
		
		System.out.println(Data.power(2,4) + "����");
		
		
		System.out.println(Data.sum(1, 10, 2));
		
	}	// ���� �����ʹ� static���� �����ϴ� �� �ɹ� ������ 
	
}
