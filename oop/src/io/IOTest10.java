package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest10 
{

	public static void main(String[] args) throws Exception 
	{
		Data ar;
		ObjectInputStream in;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		
		
			try
			{
				while (true)
				{
				ar = (Data) in.readObject(); // object ����Ÿ���̶� ����ȯ�� ����� �о�;� �Ѵ�. //��ü �ϳ��� �����´�.
				System.out.println(ar);
				}
				
			}
			catch(EOFException e) {} // while ���� ���������� ���
			
		
		// ���赵�� ������ ���д´�.
		// �������� ��, �ҷ��ö� �����Ǿ��� ���� �ִ�.
		// ���� ����
//		���� ��Ʈ�� 1����Ʈ
//		���۽�Ʈ�� 	�� �پ�
//		������Ʈ ��Ʈ�� � �ڷ������� ������ ��
			
		in.close();
	}
}
