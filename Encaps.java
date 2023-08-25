package practice;
class School{
	private String Name;
	private String History;
	private String Branch;
	private int Fess;
	
}
class Teacher extends School{
	private String Name;
	private String History;
	private String Branch;
	private int Fees;
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getHistory() {
		return History;
	}
	public void setHistory(String History) {
		this.History= History;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String Branch) {
		this.Branch=Branch;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int Fees) {
		this.Fees=Fees;
	}
	void display() {
		System.out.println(Name+" "+History+" "+Branch+" "+Fees);
	}
}
class Students extends School{
	private String Name;
	private String History;
	private String Branch;

public String getName() {
	return Name;
}
public void setName(String Name) {
	this.Name=Name;
}
public String getHistory() {
	return History;
}
public void setHistory(String History) {
	this.History= History;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String Branch) {
	this.Branch=Branch;
}
void display1() {
	System.out.println(Name+" "+History+" "+Branch);
}
}


public class Encaps {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setName("Government Girls high school");
		t.setHistory(" Tenkasi District");
		t.setBranch(" Biology");
		t.setFees(1000000);
		t.display();
		
		Students s=new Students();
		s.setName("Government Girls high school");
		s.setHistory(" Tenkasi District");
		s.setBranch(" Biology");
		s.display1();
	
	}

}
