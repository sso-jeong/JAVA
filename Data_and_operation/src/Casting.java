
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b);
		
		//int c = 1.1; // 1.1은 소숫점, int는 정수형 데이터타입
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // f .getClass() : 데이터 타입을 알려줌 

	}

}
