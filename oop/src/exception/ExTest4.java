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
		System.out.println("���ڰ� �ƴ� ���� ������ ����");
		int total = 0;
		
		while (true) {
			try 
			{
				list.add(sc.nextInt());
			
			}
			catch (InputMismatchException e) 
			{
				System.out.println("���ڰ� �ƴմϴ�.");
				sc.nextLine();
				System.out.println("-------------------------");
				break;
			}
		}
		
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

// Ƚ���� ������ ���� �ʰ� ó���� ������ �޾� 
// ���ڰ� �ƴ� ���� ������ �Է� ����
// �׸��� ������ �հ踦 ����.
// while ������ �ݺ� Ƚ�� ��
// ���ڰ� �ƴѰ� try catch�� ��Ƴ���

//
//2
//5
//10
//3
//x
//--------------------- �ٱ߰�
//2+5+10+3 =20
