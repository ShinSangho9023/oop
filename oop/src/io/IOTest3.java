package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// �ؽ�Ʈ ���� �б�
public class IOTest3 
{

	public static void main(String[] args) 
	{
		FileReader in = null;
		int ch;
		try // ���� ���� // �̰� �츮�� ���� Ŭ���� �Ͱ� ������ �����̴�.
		{
			in = new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java");
		} 
		catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�");
			return;
		}
		
		//------------------------------------
		
		try // ���� �б�
		{					//read() �޼��尡 int���̴�. �׷��� ���� �ڷ����� int�� ���.
			while((ch = in.read()) != -1)	// ���Ͽ��� 1���� �б�. ����ȯ ���ϰ� ����ϸ� ���ڹ�ȣ�� ���̰� �ȴ�. �� �а� ������ ������ -1�� �����Ѵ�.
			System.out.print((char)ch); // ���� ���� ���
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//-------------------------------------
		
		try // ���� �ݱ�
		{
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
