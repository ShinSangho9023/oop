package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		int i;
		String inFilename, outFilename;
		File inFile, outFile;
		
		Scanner sc = new Scanner(System.in);
		
		
		//��������	
		System.out.println("���� ���ϸ� : ");
		inFilename = sc.nextLine();
		inFile = new File(inFilename);
		
		if(!inFile.isFile()) {												//���� ���� Ȯ���ϱ�
			System.out.println(inFilename + " ������ �����ϴ�.");
			return;
		}
		in = new FileInputStream(inFilename);

		
		// ��� ����
		System.out.println("���纻 ���ϸ� : ");
		outFilename = sc.nextLine();
		outFile = new File(outFilename);
		
		if(outFile.isFile()) 
		{
			System.out.println("�̹� �����ϴ� ���ϸ��Դϴ�. ����ðڽ��ϱ�? (y/n)");
			if (sc.nextLine().equalsIgnoreCase("n")) 
			{
				return;
			}
		}
		
		out = new FileOutputStream(outFilename); // ���⿡ ������ ����
		
		while((i = in.read()) != -1)  // ���� ���
		{
			out.write(i);
		}
		
		System.out.println("����Ϸ� �Ǿ����ϴ�.");
		
		in.close();
		out.close();
		
	}

}
