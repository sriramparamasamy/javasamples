package Officeemployees;

class overallemployees implements Employees{
	public void Accountant() 
		{

			System.out.println("The name of accountant:" );
		}
	public static void main(String args[]) {
		overallemployees a = new overallemployees();
		a.Accountant();
		

technician c = new technician();
	

		
		c.accoun("krishna");
		c.salary(30000);
		c.accoun("karthi");
		
		c.engg("ram");
		c.Engsalary(35000.00);

		c.techni("baskar");
		c.technisalary(45000);

		
		// Here the object technician onlyy created to a poinnter c, but due to the inheritance we extends with 
		// the super class and subclass accountatn and engineer.
		// there is no compilation error shown.
		// At the same time we denote a pointer with a with accountant only accountant class get through run.
	
	}

	
			
		// My doubt on implementing interface we know that there is atleast 
			//one declaration should be given.
			//
		//doubt cleared.
	
	
	

	@Override
	public void Engineer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Technician() {
		// TODO Auto-generated method stub
		
	}
}
