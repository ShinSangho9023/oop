package exception;
// 직접 예외 클래스를 만들어서 사용하는 법
public class ScoreException extends Exception // 입셉션를 상속
{
	public ScoreException () 
	{
		super("정수가 범위를 벗어남");
	}
}
