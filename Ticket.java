import cs1.Keyboard;

public class Ticket implements Comparable<Ticket>{

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
    
    public String getDescrip(){
        return _descrip;
    }
    
    public String getName(){
	return _name;
    }

    public String getSoln(){
        return _solutionDescrip;
    }
public boolean isSolved(){
	return _solved;
    }
    
    //-------------------------^^ Accessors ^^-----------------------
    //-------------------------vv  Mutators  vv-----------------------
    
    public int setVIP( int level ){
        int old = _vipLevel;
        _vipLevel = level;
        return old;
    }
    
    public String setDescrip( String descrip ){
        String old = _descrip;
        _descrip = descrip;
        return old;
    }

    public String setSoln( String soln ){
        String old = _solutionDescrip;
        _solutionDescrip = soln;
        return old;
    }
    
    public boolean setSolved( boolean state ){
        boolean old = _solved;
        _solved = state;
        return _solved;
    }

    //-------------------------^^  Mutators  ^^-----------------------

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
    public String toString(){
	String ret= "";
	ret= "===================================\n" +
	    "Name: "+  getName()+ "\t\t" +
	    "Ticket Number: " + getID()+ "\n" +
	    "Priority: " + getVIP() + "\n" +
	    "Problem: " + getDescrip() + "\n" +
	    "Solution:" + getSoln() + "\n" +
	    "Status:" + isSolved() +
	    "\n===================================\n";
	return ret;
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
        noInternet();
	}
	_solved = true;
    }


    public void noInternet(){
	System.out.println("Have you tried turning your router on and off yet?");
	System.out.println("Response(Y or N): ");
	String response = Keyboard.readString().toUpperCase();
	if (response.equals("Y")){
	    System.out.println("Is your router in one piece?");
	    System.out.println("Response(Y or N): ");
	    response = Keyboard.readString().toUpperCase();
	    if (response.equals("N")){
		System.out.println("You need a new router then. " +
				   "Thank you for calling!");
	    }
	    else{
		System.out.println("Is your router connected to a power " +
				   "source?");
		System.out.println("Does it have any battery left?");
		System.out.println("Response(Y or N): ");
		response = Keyboard.readString().toUpperCase();
		if (response.equals("N")){
		    System.out.println("Plug it in and come back later if it " +
				       "still isn't working. Thanks for " +
				       "calling!");
		}
		else{
		    System.out.println("Try calling the manufacturer then.");
		    System.out.println("Have a nice day!");
		}
	    }
	}
	else{
	    System.out.println("Please do so.");
	    System.out.println("Did it work?");
	    System.out.println("Response(Y or N): ");
	    response = Keyboard.readString().toUpperCase();
	    if (response.equals("Y")){
		System.out.println("Great to hear! Have a good day");
	    }
	    else{
		noInternet();
	    }
	}
    }

    public void brokenComputer(){
	System.out.println("Have you tried turning it on and off yet?");
	System.out.println("Response(Y or N): ");
	String response = Keyboard.readString().toUpperCase();
	if (response.equals("Y")){
	    System.out.println("Is your computer in one piece?");
	    System.out.println("Response(Y or N): ");
	    response = Keyboard.readString().toUpperCase();
	    if (response.equals("N")){
		System.out.println("You need a new computer then. " +
				   "Thank you for calling!");
	    }
	    else{
		System.out.println("Is your computer connected to a power " +
				   "source?");
		System.out.println("Does it have any battery left?");
		System.out.println("Response(Y or N): ");
		response = Keyboard.readString().toUpperCase();
		if (response.equals("N")){
		    System.out.println("Plug it in and come back later if it " +
				       "still isn't working. Thanks for " +
				       "calling!");
		}
		else{
		    System.out.println("Try calling the manufacturer then.");
		    System.out.println("Have a nice day!");
		}
	    }
	}
	else{
	    System.out.println("Please do so.");
	    System.out.println("Did it work?");
	    System.out.println("Response(Y or N): ");
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
