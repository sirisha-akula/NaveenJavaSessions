package oops_Interface;

public class TestHosiptal {

	
	
	public static void main(String[] args) {
		
		final int weekdays =7;

		ApolloHosiptal ap = new ApolloHosiptal();
		ap.cardioServices();
		ap.dentalServices();
		ap.emergencyServices();
		ap.medicalInsurance();
		ap.medicalTraning();
		ap.pathologyServices();
		ap.pediaServices();
		ap.physioServices();
		ap.oncologyServices();
		ap.radioServices();
		ap.medicalFunds();
		ap.healthGuideLines(); //inherited method of UNHG class
		ap.optServices();//this is default method of USMedical Interface and default methods can be ovveriden
		System.out.println("**********");
		
		//USMedical us = new USMedical(); cannot create object of Interface, 
		
		//top casting:
		//child class object can be referred by parent Interface reference variable.
		//Here you can only access USMedical methods and Common Method but cannot access UKMedical, INdianMedical and Individual method of ApolloHositpal
		//as Reference type check is failed.
		
		USMedical us = new ApolloHosiptal();
		us.cardioServices();
		us.physioServices();
		us.oncologyServices();
		us.emergencyServices();
		us.medicalFunds();
		us.covidTest();
		us.vaccination();
		us.covidReport("USDELTAVersion");
		us.optServices();
		System.out.println("**********");
		
		
		System.out.println(USMedical.min_fee);
		System.out.println(ApolloHosiptal.min_fee);
		USMedical.billing();
		//ApolloHosiptal.billing(); we cannot access static method of USMedical interface with extended class(ApolloHosiptal) i.e.ApolloHosiptal.billing(); 
		
		
		System.out.println("**********");
		UKMedical uk = new ApolloHosiptal();
		uk.radioServices();
		uk.medicalFunds();
		us.medicalFunds(100);
		uk.covidTest();
		uk.vaccination();
		uk.covidReport("UKOMICRON");
		System.out.println("**********");
		
		IndianMedical im = new ApolloHosiptal();
		im.dentalServices();
		im.pediaServices();
		im.emergencyServices();
		im.medicalFunds();
		im.covidTest();
		im.vaccination();
		im.covidReport("ALPHA");
			
		
		//Down Casting:it is not allowed.
		//in java interface object is not allowed.
	//	ApolloHosiptal ap1 = new USMedical();
		
			
			
	}

}
