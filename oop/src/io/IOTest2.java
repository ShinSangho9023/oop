package io;

import java.io.FileWriter;
import java.io.IOException;

// �ؽ�Ʈ ���� ���
public class IOTest2 
{

	public static void main(String[] args) 
	{
		FileWriter out = null;
		
		//1.��Ʈ�� ���� 
		try 
		{
			out = new FileWriter("b.txt");	   	// ���� �̸��� ������ ������ �ٿ��ֱ� �Ǵϱ� �׻� Ȯ���ϴ� �޼��带 ���� �� ��.
		} 										// FileWriter ��� ���� ����
		catch (IOException e)  
		{
			System.out.println("���� ���� ����");
			return;
		}
		
		//2.����� �۾�
		try 
		{
			out.write('A'); // ���ڸ� ��� 1����Ʈ
			out.write('��'); 			 	//2����Ʈ
			out.write('\n'); 
		} 
		catch (IOException e) 
		{
			System.out.println("���� �۾� �� ����");
		}
		
		//3.��Ʈ�� �ݱ� ���������� �����͸� �׻� �о�� �Ѵ�.
		try 
		{
			out.close(); // ������ �޼��� // ���� ������ �����Ͱ� �սǵ� �� �ִ�.
		} 
		catch (IOException e) 
		{
			System.out.println("���� �ݱ� ����");
		}
	}
}
