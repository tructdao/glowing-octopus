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
	System.out.println("Hello, We look forward to solving your problem.\n "
			   + "To get started can you tell us your name?");
	String nombre= Keyboard.readString();
	System.out.println("ok, thank you " + nombre+ ". " +
			   "Can you describe your problem for me?");
	String problem= Keyboard.readString();
	int importance= (int) (Math.random()*25);
	System.out.println("OK I understand your problem, here's your ticket " +
			   "number " + numPpl +". " +
			   "We will help you shortly, please hold. :)");
	_tickets.add( new Ticket(importance, problem, nombre,numPpl));
	numPpl=numPpl+1;
    }

    public static void main(String[] args){
	HelpDesk hd= new HelpDesk();
	hd.newTicket();
    }
}
