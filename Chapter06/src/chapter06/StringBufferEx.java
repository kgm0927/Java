package chapter06;

// 예제 6-8: StringBuffer 클래스 메소드 활용

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.delete(8, 13);
		System.out.println(sb);
		
		sb.setLength(4);
		System.out.println(sb);
	}

}
