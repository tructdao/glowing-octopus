import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> _tickets;
    private int numPpl;
    private int solved;
    
    public HelpDesk(){
	_tickets = new ArrayPriorityQueue<Ticket>();
	numPpl=0;
	solved=0;
    }

    public void newTicket(){
	System.out.println("Hello, We look forward to solving your problem.\n"
			   + "To get started can you tell us your name?");
	String nombre = Keyboard.readString();
	System.out.println("OK, thank you " + nombre + ". " +
			   "Can you describe your problem for me?");
	String problem = issue();
	int importance = (int) (Math.random()*25);
	System.out.println("OK I understand your problem, here's your ticket " +
			   "number " + numPpl +".\n" +
			   "We will help you shortly, please hold. :)");
	_tickets.add( new Ticket(importance, problem, nombre,numPpl) );
	numPpl=numPpl+1;
    }

    public static String issue(){
	System.out.println("Do you have a:");
	System.out.println("\tA) broken computer?");
	System.out.println("\tB) Internet issues?");
	System.out.print("\nResponse(A or B): ");
	String ret = Keyboard.readString().toUpperCase();
	System.out.println();
	return ret;
    }

    public static void main(String[] args){
	HelpDesk hd= new HelpDesk();
	hd.newTicket();
    }
}
