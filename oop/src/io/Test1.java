package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test1 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		FileWriter out = null;
		String fileName;
		File file, tempFile;
		String text = null;
		String text1 = null;
		int line = 0;
		ObjectOutputStream save;
		
		System.out.println("* ������ �Է��ϼ��� (����� �� �࿡�� ����)");
		while(true) 
		{
			System.out.print(++line + ":");			
			text = sc.nextLine();
			if (text.length() == 0) 
			{
				break;
			}
			text1 += text + "\n";
		}
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n)");
		String input = sc.nextLine();
		
		while (input.equalsIgnoreCase("y"))
		{
			System.out.print("���� �� : ");
			fileName = sc.nextLine();
			file = new File(fileName);
			
			if (file.exists()) 
			{
				System.out.println("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n)");
				if (sc.nextLine() == "n") {
					continue;
				}
			}
			System.out.println(file + "������ ���� �Ǿ����ϴ�.");
			
			
			save = new ObjectOutputStream(new FileOutputStream(fileName));
			save.writeObject(text1);
			save.close();
			break;
		}
		
		
		
		
	}

}
