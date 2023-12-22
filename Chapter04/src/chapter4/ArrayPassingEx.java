package chapter4;


// 예제 4-8: 인자로 배열이 전달되는 예

public class ArrayPassingEx {

	static void replaceSpace(char a[]){
		for(int i=0; i<a.length;i++){
			if(a[i]==' ')// 공백 문자를 ','로 변경
				a[i]=',';
		}
	
	}
	
	static void printCharArray(char a[]){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]={
		'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'
		};
		
		printCharArray(c);// 원래 배열 원소 출력
		replaceSpace(c);	// 공백 문자 바꾸기
		printCharArray(c);// 수정된 배열 원소 바꾸기
	}

}
