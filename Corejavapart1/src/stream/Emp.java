package stream;

public class Emp {
	
	int eid;
	String ename;
	String designation;
	int salary;
	
	public Emp(int eid, String ename, String designation, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}