
public class HelloVar_02 {

	public static void main(String[] args) {

		
		int num1 = 2147483647; //int의 최대값 = 2147483647
		
		System.out.println(num1 + 1); 
		//연산(계산)결과가 절대 (-)로 나올 수 없는 상황인데
		//결과가(-)로 표현되는 상황은
		//기억장소에 저장할 수 있는 값의 범위를 넘어선 오류 상황이다. (논리 오류)
		
		
		long num2 = 3020340230993923493l;
		long num3 = 2147483647l;
		//숫자 끝 영어 소문자L
		
		System.out.println(num3 + 1);
		
		
		
		
	}

}
