

public class Director {// Director
    private Builder builder;// Builder를 참조하는 role 속성

    // 생성자 
    public Director(Builder builder) {
    	
        this.builder = builder;
    }

    // 문서를 만드는 메소드
    public void construct() {// Builder의 인터페이스를 이용하여 복합체를 구성하는 role 메소드
    	// Template method의 역할과 유사함.
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
            "How are you?",
            "Hello.",
            "Hi.",
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
            "Good morning.",
            "Good afternoon.",
            "Good evening.",
        });
        builder.close();
    }
}
