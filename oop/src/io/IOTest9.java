package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest9 {

	public static void main(String[] args) throws Exception {
		Data d1 = new Data(1, 2.3, "aaa"); //메모리에 저장된 상태
		Data d2 = new Data(2, 1.1, "bbb");
		Data d3 = new Data(3, 3.3, "ccc");
		
		// 위 객체를 파일에 저장
		
		ObjectOutputStream out = null;
		out = new ObjectOutputStream(new FileOutputStream("ob.data"));
		
		
		// 객체를 내보낼 수 있다. 스트링으로 저장할 수도 있고 객체 단위로 저장할 수도 있다.
		out.writeObject(d1);
		out.writeObject(d2);
		out.writeObject(d3);
		
		//어레이 리스트를 저장할때는 어떻게 해야하는 걸까?
		
		out.close();
	}
}
//java.io.NotSerializableException 객체 직렬화