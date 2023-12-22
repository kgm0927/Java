
public class PrinterProxy implements Printable{

	private String name;		// 이름
	private Printer real;		// '본인'
	
	// 생성자
	public PrinterProxy(){
		this.name="No name";
		this.real=null;
		
	}
	// 생성자(이름 지정)
	public PrinterProxy(String name){
		this.name=name;
		this.real=null;
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		if(real!=null){
			real.setPrinterName(name);
		}
		this.name=name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		realize();
		real.print(string);
	}
	
	// 본인 생성
	private synchronized void realize(){
		if(real==null){
			real=new Printer(name);
		}
	}

}
