
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making root entries...");
		
		Directory rootdir=new Directory("root");
		Directory bindir=new Directory("bin");
		Directory tmpdir=new Directory("tmp");
		Directory usrdir=new Directory("usr");
		
	
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
	
		
			bindir.add(new File("vi",10000));
			bindir.add(new File("latex",20000));
			;
			
			
		System.out.print("Making user entries...");
		Directory youngjin=new Directory("youngjin");
		Directory gildong=new Directory("gildong");
		Directory dojun=new Directory("dojun");
		
		usrdir.add(youngjin);
		usrdir.add(gildong);
		usrdir.add(dojun);
		
		youngjin.add(new File("diary.html",100));
		youngjin.add(new File("Composite.java",200));
		gildong.add(new File("memo.tex",300));
		gildong.add(new File("index.html",300));
		dojun.add(new File("game.doc",400));
		dojun.add(new File("junk.mail",500));
		
	
		NumberOfFileVisitor NOF=new NumberOfFileVisitor();
		rootdir.accept(NOF);
		System.out.println();
		System.out.println("파일의 개수는 "+NOF.file_count()+"이다.");
		
	}

}
