package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		// Ű����� ���� 5���� �Է¹޾� �迭 num�� ����
		
		for (int i = 0; i < num.length; i++)
		{
			try 
			{
				num[i] = sc.nextInt();
			} 
			
			catch (InputMismatchException e) // ���� �������� �� �� �Ϻη� ���ܸ� ������ ���� �ᵵ ��.
			{  								// Ȥ�� ���� Ÿ���� ����ó���� ��� �� �� �޾Ƶ� ��.
				// ���۸� ���� i��°�� �ٽ�
				System.out.println("���ڸ� ����� �Է��ϼ���");
				sc.nextLine();//�� ���� �Ѳ����� �б� ������ ���� �о�� ���۰� �����
				i--; 
			}
		}
		
		for (int j = 0; j < num.length; j++) 
		{
			System.out.print(num[j] + " ");
		}
		
		
		// �迭�� ����� �� 5���� ���
		
		
		
		
	}
}
//1
//2
//a 
//3
//b
//4
//5 
//
//1 2 3 4 5 
//
//���� ������ ����ؼ� 
//
//�ٸ� ���� ��� �͵� �����ϰ� try catch�� �̿��ؼ� �ٽ� �Է� �ްڱ�. ���ڸ� �ټ��� �ްڱ�