import cs1.Keyboard;

public class Ticket implements Comparable{

    private int _vipLevel, _ID;
    private String _descrip, _name, _solutionDescrip;
    private boolean _solved;

    //default constructor
    public Ticket(){
	_vipLevel = 0;
	_ID = 0000;
	_descrip = "";
	_name = "";
	_solutionDescrip = "";
	_solved = false;
    }

    //overloaded constructor
    public Ticket(int vip, String descrip, String name,int id){
	this();
	_vipLevel = vip;
	_descrip = descrip;
	_name = name;
	_ID=id;
    }

    //-------------------------vv Accessors vv -----------------------
    
    public int getVIP(){
	return _vipLevel;
    }

    public int getID(){
	return _ID;
    }
    
    public String getName(){
	return _name;
    }

    public boolean isSolved(){
	return _solved;
    }
    
    //-------------------------^^ Accessors ^^ -----------------------
    
    public int compareTo(Object x){
        return 0;
    }

    public int compareTo(Ticket x){
	if(x.getVIP()> this.getVIP()){
	    return -1;
	}
	else if(x.getVIP() < this.getVIP()){
	    return 1;
	}
	else{
	    return 0;
	}
    }

    public void solveIssue(){
	System.out.println("Welcome to the Help Desk!\n" +
			   "Thank you for your patience.\n" +
			   "Please respond to the following questions with " +
			   "Y or N. Thanks for your cooperation!");
	if (_descrip.equals("A")){
	    brokenComputer();
	}
	if (_descrip.equals("B")){
	}
	_solved = true;
    }

    public void brokenComputer(){
	System.out.println("Have you tried turning it on and off yet?");
	System.out.println("Response: ");
	String response = Keyboard.readString().toUpperCase();
	if (response.equals("Y")){
	    System.out.println("Is your computer in one piece?");
	    System.out.println("Response: ");
	    response = Keyboard.readString().toUpperCase();
	    if (response.equals("N")){
		System.out.println("You need a new computer then. " +
				   "Thank you for calling!");
	    }
	    else{
		System.out.println("Is your computer connected to a power " +
				   "source?");
		System.out.println("Does it have any battery left?");
		System.out.println("Response: ");
		response = Keyboard.readString().toUpperCase();
		if (response.equals("N")){
		    System.out.println("Plug it in and come back later if it " +
				       "still isn't working. Thanks for " +
				       "calling!");
		}
		else{
		}
	    }
	}
	else{
	    System.out.println("Please do so.");
	    System.out.println("Did it work?");
	    System.out.println("Response: ");
	    response = Keyboard.readString().toUpperCase();
	    if (response.equals("Y")){
		System.out.println("Great to hear! Have a good day");
	    }
	    else{
		brokenComputer();
	    }
	}
    }
}
