
public class HelloVar_06 {

	public static void main(String[] args) {

		
		float korScore = 90f;
		float engScore = 80f;
		float mathScore = 70f;
		//float = �Ǽ��� (�Ҽ��� ���� 6�ڸ�����)
		//float�� ����� ������ ���ڰ��� �����Ҷ����� �ڿ��� f�� ����(���������� ���� �� ����)
				
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		
		System.out.println("����:" + sum);
		
		float avg = sum / 3;
		System.out.println("���:" + avg);
		
	}

}
