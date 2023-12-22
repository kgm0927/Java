
public class Printer implements Printable {

	private String name; // 이름
	
	// 생성자
	public Printer(){
		heavyJob("Printer 인스턴스 생성 중");
	}
	
	// 생성자 (이름 지정)
	public Printer(String name){
		this.name=name;
		heavyJob("Printer 인스턴스"+name+" 생성 중");
		
	}
	
	
	@Override
	public void setPrinterName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	// 이름 붙여서 표시
	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		System.out.println("==="+name+"===");
		System.out.println(string);	
	}
	

	// 무거운 작업이라고 가정
	private void heavyJob(String msg){
		System.out.println(msg);
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
			System.out.print(".");
		}
		System.out.println("완료");
	}


}
