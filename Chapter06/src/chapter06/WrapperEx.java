package chapter06;


// 예제 6-5: Wrapper 클래스 활용
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Character.toLowerCase('A'));
			
			char c1='4', c2='F';
			if(Character.isDigit(c1))
				System.out.println(c1+"는 숫자");	// 문자 c1이 숫자이면 true
			if(Character.isAlphabetic(c2))
				System.out.println(c2+"는 영문자");// 문자 c2가 영문자이면 true
			
		
			System.out.println(Integer.parseInt("-123"));
			System.out.println(Integer.toHexString(28));
			System.out.println(Integer.toBinaryString(28));
			System.out.println(Integer.bitCount(28));
			
			Double d=Double.valueOf(3.14);
			System.out.println(d.toString());
			System.out.println(Double.parseDouble("3.14"));

			boolean b=(4>3);
			System.out.println(Boolean.toString(b));
			System.out.println(Boolean.parseBoolean("false"));
	}

}
