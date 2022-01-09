package FinalizeMethod;

public class Company {

	
	
	@Override
	public void finalize() {  //This finalize method is overridden by Company class
		System.out.println("inside finalize method....Company class");
	}
}

/* Practical use of finalize():
 * DB connection:
 * make the DB connection ---connected
 * hit the sql query 
 * get the result from DB --get exception
 * 
 * finally{ //exception is coming or not finally block is executed.
 * closing the DB connection
 * }
 * 
 * 
 *finalize():
 *launch the browser
 *fill the form on login page
 *driver = null;
 *finalize(){
 *clean up activity
 *    reinitialize the driver (or)
 *    driver.quit();
 *    shutdown the selenium server.
 *}
 */





