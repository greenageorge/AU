import java.util.Scanner;

abstract class Book_Ticket{
	public static int booking_count=0;
	public int booking_id;
	public String name;
	public String time;
	public String source;
	public String destination;
	public final void book(String name, String time, String source, String destination) {
		booking_id=booking_count+1;
		booking_count++;
		this.name=name;
		this.time=time;
		this.source=source;
		this.destination=destination;
		
	}
	
	public void printBookingDetails() {
		System.out.println("Booking id: "+booking_id+"\n"+"Name: "+ name+"\n"+"Time: "+time+"\n"+"Source: "+source+"\n"+"Destination: "+destination);
	}
	
	public abstract void travelDetails();
}

class Book_Flight extends Book_Ticket{
	String travelmode="Flight";
	int gateno;
	int luggage_allowed=15;
	
	Book_Flight(String name, String time, String source, String destination, int gateno) {
		super.book(name,time,source,destination);
		this.gateno = gateno;
	}
	
	public void travelDetails() {
		super.printBookingDetails();
		System.out.println("Gate no: "+ gateno+"\nLuggage Allowed in kg: "+luggage_allowed);
	}
}

class Book_Train extends Book_Ticket{
	String travelmode="Train";
	int platformno;

	Book_Train(String name, String time, String source, String destination, int platformno) {
		super.book(name,time,source,destination);
		this.platformno = platformno;
	}
	public void travelDetails() {
		super.printBookingDetails();
		System.out.println("Platform no: "+ platformno);
	}
	
}

class Book_Bus extends Book_Ticket{
	
	String travelmode="Bus";
	String boardinglocation;
	Book_Bus(String name, String time, String source, String destination, String boardinglocation) {
		super.book(name,time,source,destination);
		this.boardinglocation = boardinglocation;
	}
	public void travelDetails() {
		super.printBookingDetails();
		System.out.println("Boarding location: "+ boardinglocation);
	}
	
	
	
}


public class TemplatePattern {

	public static void main(String[] args) {
		Book_Ticket b;
		boolean booked=false;
		boolean choice=true;
		do {
			System.out.println("MENU\n1.Book Flight\n2.Book Train\n3.Book Bus\n");
			Scanner s=new Scanner(System.in);
			int c=s.nextInt();
			
			String name, time, to, from, boarding;
			int no;
			Scanner s1=new Scanner(System.in); 
			switch(c) {
			case 1: 
				 System.out.println("Enter name");
				 name=s1.next();
				 System.out.println("Enter time");
				 time=s1.next();
				 System.out.println("Enter Source");
				 from=s1.next();
				 System.out.println("Enter Destination ");
				 to=s1.next();
				 System.out.println("Enter gate no:");
				 no=s1.nextInt();
				 
				 b=new Book_Flight(name, time ,from,to,no);
				 b.travelDetails();
				break;
				
			case 2:
				 System.out.println("Enter name");
				 name=s1.next();
				 System.out.println("Enter time");
				 time=s1.next();
				 System.out.println("Enter Source");
				 from=s1.next();
				 System.out.println("Enter Destination ");
				 to=s1.next();
				 System.out.println("Enter platform no:");
				 no=s1.nextInt();
				b=new Book_Train(name,time,from,to,no);
				b.travelDetails();
				break;
				
			case 3:
				System.out.println("Enter name");
				 name=s1.next();
				 System.out.println("Enter time");
				 time=s1.next();
				 System.out.println("Enter Source");
				 from=s1.next();
				 System.out.println("Enter Destination ");
				 to=s1.next();
				 System.out.println("Enter boarding location:");
				 boarding=s1.next();
				 b=new Book_Bus(name,time,from,to,boarding);
				 b.travelDetails();
				break;
				
			
				
			case 4:
				choice= false;
				break;
				
				
			}
			
		}while(choice);
		

	}

}
