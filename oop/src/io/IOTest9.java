package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest9 {

	public static void main(String[] args) throws Exception {
		Data d1 = new Data(1, 2.3, "aaa"); //�޸𸮿� ����� ����
		Data d2 = new Data(2, 1.1, "bbb");
		Data d3 = new Data(3, 3.3, "ccc");
		
		// �� ��ü�� ���Ͽ� ����
		
		ObjectOutputStream out = null;
		out = new ObjectOutputStream(new FileOutputStream("ob.data"));
		
		
		// ��ü�� ������ �� �ִ�. ��Ʈ������ ������ ���� �ְ� ��ü ������ ������ ���� �ִ�.
		out.writeObject(d1);
		out.writeObject(d2);
		out.writeObject(d3);
		
		//��� ����Ʈ�� �����Ҷ��� ��� �ؾ��ϴ� �ɱ�?
		
		out.close();
	}
}
//java.io.NotSerializableException ��ü ����ȭ