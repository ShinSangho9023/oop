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
		String text1 = "";
		int line = 0;
		ObjectOutputStream save;
		
		System.out.println("* 내용을 입력하세요 (종료는 새 행에서 엔터)");
		while(true) 
		{
			System.out.print(++line + ":");			
			text = sc.nextLine();
			System.out.println(text);
			
			if (text.length() == 0) 
			{
				break;
			}
			// 끝부분부터 찾는 메서드로 찾고 삭제?
		}
		
		System.out.print("저장하시겠습니까? (y/n)");
		String input = sc.nextLine();
		
		while (input.equalsIgnoreCase("y"))
		{
			System.out.print("파일 명 : ");
			fileName = sc.nextLine();
			file = new File(fileName);
			
			if (file.exists()) 
			{
				System.out.println("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n)");
				if (sc.nextLine() == "n") {
					continue;
				}
			}
			System.out.println(file + "파일이 저장 되었습니다.");
			
			
			save = new ObjectOutputStream(new FileOutputStream(fileName));
			save.writeObject(text1);
			save.close();
			break;
		}
		
		System.out.println(text1);
		
		
	}

}
