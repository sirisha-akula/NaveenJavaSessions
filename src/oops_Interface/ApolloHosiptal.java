package oops_Interface;

public class ApolloHosiptal extends UNHG implements USMedical , UKMedical, IndianMedical{

	//USMedical service
	@Override
	public void physioServices() {
		System.out.println("AH----physioServices");		
	}

	@Override
	public void cardioServices() {
		System.out.println("AH----cardioServices");		
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("AH----oncologyServices");		
		
	}

	//UKMedical service
	@Override
	public void radioServices() {
		System.out.println("AH----radioServices");		
	
	}

	@Override
	public void pathologyServices() {
		System.out.println("AH----pathologyServices");		

	}

	//IndianMedical service
	@Override
	public void dentalServices() {
		System.out.println("AH----dentalServices");		
		
	}

	@Override
	public void pediaServices() {
		System.out.println("AH----pediaServices");		
		
	}

	//Common method which is coming from all Interface but we have to Override only once, otherwise it becomes duplicate method and java does not allow duplicate method
	//Here we do not bother from which interface "emergency service" method is coming.
	@Override
	public void emergencyServices() {
		System.out.println("AH----emergencyServices");
	}
	
	public void medicalTraning() {
		System.out.println("AH----medicalTraning");
	}
	
	public void medicalInsurance() {
		System.out.println("AH----medicalInsurance");
	}

	//Medical Interface
	@Override
	public void medicalFunds() {
		System.out.println("AH----Medical Funds");		
	}

	//WHO Interface
	@Override
	public void covidTest() {
		System.out.println("AH----CovidTest");		
		
	}

	@Override
	public void vaccination() {
		System.out.println("AH----Vaccination");		
		
	}

	@Override
	public void covidReport(String version) {
		System.out.println("AH----CovidReport"+version);		
	}

	@Override
	public void medicalFunds(int fee) {
       System.out.println("FH---Medical Fund" +fee);		
	}

	@Override  //default non -abstract method of USMedical Interface and this methods can be ovveriden
	public void optServices() {
		System.out.println("AH---OptServices");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
