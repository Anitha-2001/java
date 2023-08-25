package practices;

 class Person1 {
	private String Name;
	private String address;
	private int idnum;
	Person1(String name,String Address,int idnum){
		this.Name=Name;
		this.address=Address;
		this.idnum=idnum;
	}
	public String getName() {
		return this.Name;
		
	}
	public String getAddress() {
		return this.address;
	}
	
	public int getidnum() {
		return this.idnum;
	}
	class Teacher extends Person1{
		private String name;
		private String address;
		private int salary;
		private int idnum;
		void Teacher(String name,String address,int idnum,int salary){
			this.name=name;
			this.address=address;
			this.idnum=idnum;
			this.salary=salary;
		}
		public String getname() {
			return this.name;
		}
		public String getaddress() {
			return this.address;
		}
		public int getidnum() {
			return this.idnum;
		}
		public int getsalary() {
			return this.salary;
		}
		class Student extends Person1{
			private String name;
			private String address;
			private int idnum;
			
			void Student(String name,String address,int idnum){
				this.name=name;
				this.address=address;
				this.idnum=idnum;
				
			}
			public String getname() {
				return this.name;
			}
			public String getaddress() {
				return this.address;
			}
			public int getidnum() {
				return this.idnum;
			}
			
			
			public static void main(String[] args) {
		// TODO Auto-generated method stub
				Teacher t=new Teacher("Anitha","chennai",15000,4);
				t.getperson1();
				System.out.println("hello says");
		

	}

}}
}
}
