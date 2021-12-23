package oops_Interface;

public class TestHosiptal {

	public static void main(String[] args) {
		
		ApolloHosiptal ap = new ApolloHosiptal();
		ap.cardioServices();
		ap.physioServices();
		ap.oncologyServices();
		ap.emergencyServices();
		USMedical.billing();

	}

}
