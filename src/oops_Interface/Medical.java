package oops_Interface;

public interface Medical extends WHO{
	
	public void medicalFunds();
	
	public void medicalFunds(int fee);
	
	@Override //we can override the method from parent or grand parent interface, but it has no use as we are not giving method body
	public void vaccination();

}
