package io;

import java.io.File;
import java.io.IOException;

public class IOTtest1 {

	public static void main(String[] args) {
		
		File a = new File("a.txt");
		File b = new File("sub");
		
		System.out.println(a);
		System.out.println(a.exists()); 	 // �����ϴ� ��
		System.out.println(a.isFile()); 	 // ���Ϸ� �����ϴ���
		System.out.println(a.isDirectory()); // ���丮�� �����ϴ���
		
		try 
		{
			a.createNewFile();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		// �ƹ��͵� ���� ä�� ������ �������
		// ����� �͵� a. �Լ� ȣ��� ���� �� ����
		
		b.mkdir();
		
		System.out.println(a.exists()); 	 // �����ϴ� ��
		System.out.println(a.isFile()); 	 // ���Ϸ� �����ϴ���
		System.out.println(a.isDirectory()); // ���丮�� �����ϴ���
		
		File c = new File("C:\\java\\school\\src\\school\\vo\\Student.java");
		System.out.println(c.isFile());
		System.out.println(c.getName()); 	// �����̸� ���
		System.out.println(c.getParent()); 	// ���� ��ġ
		System.out.println(c.length()); 	// byte ������ �뷮, ũ��
		
		File d = new File("C:\\java\\school\\src\\school\\vo");
		String filenames[] = d.list(); 	// ���� ���� �����̸����� �����´�.
		File files[] = d.listFiles(); 	// ���� �ȿ� ���� ��ε��� �����´�.
		
		for (int i = 0; i < filenames.length; i++) // �̸���������
		{
			System.out.println(filenames[i]);
		}
		
		for (int i = 0; i < files.length; i++) //��� ��������
		{
			System.out.println(files[i]);
		}
		
		// ���� ��ġ �˾Ƴ���
		File e = new File ("."); // ����� ���� ��ο�
		try 
		{
			System.out.println(e.getCanonicalPath());// ����ó�� �ؾ� �� �� �ִ�. ������ ���ϴ� �޼���
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		} 
		
		
		// ���ϸ� �����ϱ�
		File f = new File("a2.txt"); // a ��ü�� �������� �״������ ���� ������ �̸��� ����Ǿ���.
		a.renameTo(f); // f�� ������ �������� ������ ������ �ٿ��ֱ� ��. 
		System.out.println(a);
		
		// ���� �����ϱ�
		a.delete();
		
 	}
}
