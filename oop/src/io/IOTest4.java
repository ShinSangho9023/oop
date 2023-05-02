package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOTest4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String file = null;
		FileReader in = null;
		int ch1;
		
		while (true) 
		{
			System.out.print("���� ���� : ");
			file = sc.next();
			String ch = "\"";
			file = file.replaceAll(ch, "");
			System.out.println(file);
			
			File a = new File(file);
			
			if (a.exists() == false) 
			{
				System.out.println("���� �����ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			else break;
		}
		
		File b = new File(file);
		
		System.out.println();
		System.out.println("-------------- ���� ���� ���");
		System.out.println();
		
		try 
		{
			in = new FileReader(file);
		} 
		catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�");
			return;
		}
		
		//------------------------------------
		
		try 
		{					
			while((ch1 = in.read()) != -1)	
			System.out.print((char)ch1); 
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//-------------------------------------
		
		try 
		{
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("�� " + b.length() + "bytes");
		
	} //main
} //class

//���� ���� : c:\aaa.txt
//���� �����ϴ�. �ٽ� �Է��ϼ���.
//���� ���� : c:\Test\aaa.txt
// 
//------------ ���� ���� ���
//
//�� xxx bytes (�� �� ����Ʈ���� ���)

//
//���� Ŭ���� �� ������
//�ؽ�Ʈ ������ �д� Ŭ����