package Part_5_1_test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketMaker ticket1=TicketMaker.numbered_ticket();
		TicketMaker ticket2=TicketMaker.numbered_ticket();
		TicketMaker ticket3=TicketMaker.numbered_ticket();
		TicketMaker ticket4=TicketMaker.numbered_ticket();
		TicketMaker ticket5=TicketMaker.numbered_ticket();
		TicketMaker ticket6=TicketMaker.numbered_ticket();
		
		System.out.println(ticket1.ticket);
		System.out.println(ticket2.ticket);
		System.out.println(ticket3.ticket);
		ticket3.getNextTicketNumber();
		System.out.println(ticket4.ticket);
		System.out.println(ticket5.ticket);
		System.out.println(ticket6.ticket);
		
		if((ticket1==ticket2)&&(ticket3==ticket4)&&(ticket5==ticket6)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
