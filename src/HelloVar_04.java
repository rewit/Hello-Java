
public class HelloVar_04 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		num = 50;
		System.out.println(num);
		
		int num1 = 30;
		num1 = 40;
		System.out.println("2:"+num1);
		num1 = 0;
		System.out.println("1:"+num1);
		num1 = 100;
		num1 = 50;
		System.out.println("3:"+num1);
		
		System.out.println(num1);
		
		//명령어의 윗 변수를 적용 아래,위위 상관x ,어떤값을 저장하든 마지막 값이 적용 ex) 2:40   1:0   3:50
		
	}

}
