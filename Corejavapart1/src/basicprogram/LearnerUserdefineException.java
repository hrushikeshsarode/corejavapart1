package basicprogram;

class Learner{
	String fname,lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}

class LearnerNameException extends Exception{
	public LearnerNameException(String s) {
		super(s);
	}
}

public class LearnerUserdefineException{

	void checkName(String fname,String lname) throws LearnerNameException {
		if(fname.isBlank() && lname.isBlank()) {
			throw new LearnerNameException("fname & lname is empty");
		}
		else if(fname.isBlank()) {
			throw new LearnerNameException("fname is empty");
		}
		else if (lname.isBlank()) {
			throw new LearnerNameException("Lname is empty");
		}
		
	}
	
	public static void main(String[] args) throws LearnerNameException {
		// TODO Auto-generated method stub
		Learner l = new Learner();
		l.setFname("a");
		l.setLname("");
		LearnerUserdefineException lu = new LearnerUserdefineException();
		lu.checkName(l.getFname(), l.getLname());
		}

}