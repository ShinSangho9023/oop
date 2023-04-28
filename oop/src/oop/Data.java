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
		return this.x + this.y; // 리턴값은 값을 복사해서 넘겨준다.
	}

	public static int sum(int i, int j) // 이러면 쓸 떄마다 객체를 생성 안해도 됨.
	{
		int a = i + j;
		return a;
	}	// static 메서드 안에서는 클래스의 맴버변수 못씀.
		// static 메서드에서는 static이 아닌 다른 함수나 변수 호출 불가능
		//같은 static 끼리는 가능.
		// 소속된 클래스와 남과 같다.

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
