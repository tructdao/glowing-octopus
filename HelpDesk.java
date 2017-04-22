//it works when we remove <Ticket>
import cs1.Keyboard;
public class HelpDesk <T>{

    private ArrayPriorityQueue<T> _tickets;
    private int numPpl;
    private int solved;
    public HelpDesk(){
	_tickets = new ArrayPriorityQueue<T>();
	numPpl=0;
	solved=0;
    }

    public void newTicket(){
	System.out.println("Hello, We look forward to solving your problem.\n to get started can you tell us your name?");
	String nombre= Keyboard.readString();
	System.out.println("ok, thank you" + nombre+ ". Can you describe your problem for me?");
	String problem= Keyboard.readString();
	int importance= (int) (Math.random()*25);
	_tickets.add( new Ticket(importance, problem, nombre,numPpl));
	numPpl=numPpl+1;
    }
	

    public static void main(String[] args){
    }
}
