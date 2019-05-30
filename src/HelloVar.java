
public class HelloVar { //Var=Variable

	public static void main(String[] args) {
		// = : 같다x     = : 중심으로 오른쪽을 왼쪽으로 대입
		int num = 30; 
		//숫자30을 기억장치에 저장하고 기억장치에 num이라는 이름표를 부착
		int sum = 30+40;
		//30+40의 계산식을 기억장치에 저장하고 sum이라는 이름표를 부착
		
		//실제로는 
		//30을 임의의 기억장치에 저장
		//40을 임의의 기억장치에 저장
		//+기호를 만남
		//30과40을 각각 연산장치로 이동
		//두 수를 덧셈 수행한 후
		//결과를 기억장치에 저장하고
		//결과가 저장된 기억장치에 sum이라는 이름표를 부착
		
		System.out.println(num+sum);

			}

}
