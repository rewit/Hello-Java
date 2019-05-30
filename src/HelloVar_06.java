
public class HelloVar_06 {

	public static void main(String[] args) {

		
		float korScore = 90f;
		float engScore = 80f;
		float mathScore = 70f;
		//float = 실수형 (소수점 이하 6자리까지)
		//float로 선언된 변수에 숫자값을 대입할때에는 뒤에는 f를 붙임(문법오류가 생길 수 있음)
				
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		
		System.out.println("총점:" + sum);
		
		float avg = sum / 3;
		System.out.println("평균:" + avg);
		
	}

}
