import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> _tickets;
    private int numPpl;
    
    public HelpDesk(){
	_tickets = new ArrayPriorityQueue<Ticket>();
	numPpl=0;
    }

    public void newTicket(){
	System.out.println("Hello, we look forward to solving your problem.\n"
			   + "To get started can you tell us your name?");
	String name = Keyboard.readString();
	System.out.println("OK, thank you " + name + ". ");
	String problem = issue();
	int importance = (int) (Math.random()*25);
	System.out.println("OK I understand your problem, here's your ticket " +
			   "number: " + numPpl +".\n" +
			   "Please check back later. :)");
	_tickets.add( new Ticket(importance, problem, name,numPpl) );
	numPpl=numPpl+1;
    }

    public static String issue(){
    System.out.println("Can you describe your problem?");
    String ret = Keyboard.readString();
    System.out.println("Interesting... What have you tried so far to fix it?" );
    ret += Keyboard.readString();
    /*
	System.out.println("Do you have a:");
	System.out.println("\tA) broken computer?");
	System.out.println("\tB) Internet issues?");
	System.out.print("\nResponse(A or B): ");
	String ret = Keyboard.readString().toUpperCase();
	System.out.println();
    */
	return ret;
    }

    public static void main(String[] args){
        HelpDesk hd= new HelpDesk();
        boolean needHelp = true;
        while( needHelp ){
            System.out.println("Hello, this is tech support. Do you wish to create a ticket or look at an old one?");
            System.out.println("A) Create Ticket");
            System.out.println("B) Look at Ticket");
            System.out.println("C) Exit");
            String ans = Keyboard.readString().toUpperCase();
            if( ans.equals("A") ){
                hd.newTicket();
            } else if( ans.equals("B") ){
                //Add case where person views ticket and it is dequeued
            } else if( ans.equals("C") ){
                needHelp = false;
            } else {
                System.out.println("Input invalid");
            }
        }
    }
}
