package io;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// �ؽ�Ʈ ���� �б� - ���پ� �б�
public class IOTest5 
{
	public static void main(String[] args) 
	{
		FileReader in = null;
		BufferedReader br = null; // �̰͸����δ� �Է� ���Ѵ�. 
		int ch;
		
		try // ���� ���� // �̰� �츮�� ���� Ŭ���� �Ͱ� ������ �����̴�.
		{
			//in = (new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java"); // FileReader�� �����ش�. �ϳ��� �о���� ��Ʈ�� ��ü
			br = new BufferedReader((new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java"))); // ���پ� �о���� ��� �߰� *������ ��Ʈ��Ÿ��
						//2�ܰ�												//1�ܰ�
			//BufferedReader�� ��Ʈ���� ��Ƽ� ó���� �� �ִ� ����� �����Ѵ�.
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("������ �����ϴ�");
			return;
		}
		try 
		{
			while(true) 
			{
				String s = br.readLine(); 	// ������ �о���� ��
				if (s == null) 				// null�� ���ö����� �ݺ��ϴٰ� ����
				{
					break;
				}
				System.out.println(s); 		// �о�� ���� ���
			}
			
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			br.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} //�̷� ���۵��� �ݵ�� �ݾƾ��Ѵ�. ��Ƴ��� �����ϱ� 
		
		
		
		
	}// main
	
}// class

/**
 * new bufferedTeader(new InputStreamTeader (System.In) 
 * ����Ʈ ������ **/
