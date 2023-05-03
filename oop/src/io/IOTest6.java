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
		
		
		//원본파일	
		System.out.println("원본 파일명 : ");
		inFilename = sc.nextLine();
		inFile = new File(inFilename);
		
		if(!inFile.isFile()) {												//파일 존재 확인하기
			System.out.println(inFilename + " 파일이 없습니다.");
			return;
		}
		in = new FileInputStream(inFilename);

		
		// 대상 파일
		System.out.println("복사본 파일명 : ");
		outFilename = sc.nextLine();
		outFile = new File(outFilename);
		
		if(outFile.isFile()) 
		{
			System.out.println("이미 존재하는 파일명입니다. 덮어쓰시겠습니까? (y/n)");
			if (sc.nextLine().equalsIgnoreCase("n")) 
			{
				return;
			}
		}
		
		out = new FileOutputStream(outFilename); // 여기에 파일이 생김
		
		while((i = in.read()) != -1)  // 복사 기능
		{
			out.write(i);
		}
		
		System.out.println("복사완료 되었습니다.");
		
		in.close();
		out.close();
		
	}

}
