package oop;

public class Data 
{
	int x;
	int y;
	
	public Data () {}
	
	public Data (int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public void print() 
	{
		System.out.println("x:" + x + ", y:" + y);
	}

	@Override
	public String toString() 
	{
		return "Data [x=" + x + ", y=" + y + "]";
	}

	public int sum() {
		return this.x + this.y; // ���ϰ��� ���� �����ؼ� �Ѱ��ش�.
	}

	public static int sum(int i, int j) // �̷��� �� ������ ��ü�� ���� ���ص� ��.
	{
		int a = i + j;
		return a;
	}	// static �޼��� �ȿ����� Ŭ������ �ɹ����� ����.
		// static �޼��忡���� static�� �ƴ� �ٸ� �Լ��� ���� ȣ�� �Ұ���
		//���� static ������ ����.
		// �Ҽӵ� Ŭ������ ���� ����.

	public static int power(int i, int j) {

		int b = 1;
		for (int a = 0; a < j; a++) {
			
			b = b * i;
		}
		return b;
	}

	public static int sum(int a, int b, int c) 
	{
		int res = 0;
		
		for (int i = a; i <= b; i +=c) {
			
			res +=i;
			
		}
		return res;
	}
}
