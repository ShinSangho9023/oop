package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class IOTest7 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		
		ObjectOutputStream out = null;
		
		out = new ObjectOutputStream(new FileOutputStream("ob.data"));
		
		out.writeObject(list); // ��ü�� ������ �� �ִ�. ��Ʈ������ ������ ���� �ְ� ��ü ������ ������ ���� �ִ�.
		
		out.writeObject(list);
		out.close();
		
		
		
	
		
		
		
		
		
		
	}

}
