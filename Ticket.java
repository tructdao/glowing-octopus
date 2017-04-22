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

}
