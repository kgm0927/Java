package Part_5_1_test;

public class TicketMaker {

	public  int ticket=1000;
	public static TicketMaker ticketmaker=new TicketMaker();
	


	
	
	public  int getNextTicketNumber(){
		
		
		return ticket++;
	}
	
	
	
	
	
	public static TicketMaker numbered_ticket(){
		return ticketmaker;
		
	}
	
}
