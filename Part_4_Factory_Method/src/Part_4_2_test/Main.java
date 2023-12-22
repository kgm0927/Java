package Part_4_2_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start.");
		Triple a1=Triple.getInstance("ALPHA");
		Triple b1=Triple.getInstance("ALPHA");
		Triple c1=Triple.getInstance("ALPHA");
		Triple a2=Triple.getInstance("ALPHA");
		Triple b2=Triple.getInstance("ALPHA");
		Triple c2=Triple.getInstance("ALPHA");
		
		
		if(a1==a2){
			System.out.println("a1==a2 ("+a1+")");
			
		}
		else{
			System.out.println("a1 != a2");
		}
		
		
		if(b1==b2){
			System.out.println("b1 == b2 ("+b1+")");
		}else{
			System.out.println("b1 != b2");
		}
		
		
		if(c1==c2){
			System.out.println("c1 == c2 ("+c1+")");
		}else{
			System.out.println("c1!=c2");
		}
		
		System.out.print("\nEnd");
	}

}
