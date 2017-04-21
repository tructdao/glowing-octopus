public class Ticket{

    private int _vipLevel, _ID;
    private String _descrip, _name, _solutionDescrip;
    private boolean _solved;

    public Ticket(){
	_vipLevel = 0;
	_ID = 0000;
	_descrip = "";
	_name = "";
	_solutionDescrip = "";
	_solved = false;
    }

    public Ticket(int vip, String descrip, String name){
	this();
	_vipLevel = vip;
	_descrip = descrip;
	_name = name;
    }
    
}
