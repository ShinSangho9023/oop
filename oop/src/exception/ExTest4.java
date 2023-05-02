package exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("숫자가 아닌 값을 받으면 종료");
		int total = 0;
		
		while (true) // try에 while문을 넣어도 된다. 예외발생하면 빠져나온다.
		{
			try 
			{
				list.add(sc.nextInt());
			}
			
			catch (InputMismatchException e) 
			{
				System.out.println("숫자가 아닙니다.");
				sc.nextLine();
				System.out.println("-------------------------");
				break; // 컨티뉴를 사용하면 계속 반복가능 if문을 넣어서 조건문으로 탈출
			}
		}
		// 삼항 연산자도 사용가능, \n,\r,\b 논리연산자
		for (int i = 0; i < list.size(); i++) 
		{
			if (i == list.size() -1) 
			{
				System.out.print(list.get(i));
				total += list.get(i);
			}
			else {
				System.out.print(list.get(i)+ " + ");
				total += list.get(i);
			}
		}
		System.out.println(" = " + total);
	}
}

// 횟수는 정해져 있지 않고 처음에 정수를 받음 
// 숫자가 아닌 값을 받으면 입력 종료
// 그리고 숫자의 합계를 낸다.
// while 문으로 반복 횟수 모름
// 숫자가 아닌건 try catch로 잡아내야

//
//2
//5
//10
//3
//x
//--------------------- 줄긋고
//2+5+10+3 =20
