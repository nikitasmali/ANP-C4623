package corejava;

abstract class Abstractionexample
{
	//fields
		private int Id;
		private String Name;
		private String Address;	
		//creating parameterized constructor
		public int getId() {
			return Id;
		}
		public Abstractionexample(int id, String name, String address) {
			
			Id = id;
			Name = name;
			Address = address;
		}
		//create a method
		public void mailCheck()
		{

		}
		
		@Override
		public String toString() {
			return "Abstractionexample [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
		}
		//create getter and setter of id,name and address
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
}

