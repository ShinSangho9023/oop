package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest8 {

	public static void main(String[] args) throws Exception {

		//������ ������ �˾ƾ� �ϰ� ��ü Ÿ���� �� �� �־�� �Ѵ�. 
		
		ArrayList<String> ar;
		ObjectInputStream in;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		ar = (ArrayList<String>) in.readObject(); // object ����Ÿ���̶� ����ȯ�� ����� �о�;� �Ѵ�.
		
		
		System.out.println(ar);
		
		
		// ��� ������ ��ü�� �̷��� ����, ������ �� �ִ�.
		// �л��� ���� �͵� �̷��� ���밡��
		// �����ߴٰ� �����ؼ� ���
		
		
	}

}
