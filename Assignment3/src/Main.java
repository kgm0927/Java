
public class Main {

	public static void main(String[] args) {
		Display b1=new StringDisplay("Hello world.");
		Display b2=new UpDownBorder(b1,'-');
		Display b3=new SideBorder(b2,'*');
		
		Display b4=new FullBorder(
									new UpDownBorder(
											new SideBorder(
												new UpDownBorder(
													new SideBorder(
															new StringDisplay("Hello, world.")
																,'*'
																),
																'='),
																	'|'
																	),
											'/')
									
				);
		
		
		b1.show();
		
		System.out.println();
		b2.show();
		System.out.println();
		b3.show();
		b4.show();
	}
	
	
	
	
}
