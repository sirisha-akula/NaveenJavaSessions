package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		
		/*Primitive Data Types: No need of any Objects
		 * 
		 * Java is not fully object oriented because it supports primitive data type like char,byte, short,long,int,double etc, for these datatypes no need to create an object it directly allocates space in memory. 
		 * so these are not object oriented, and of course is what opposite of OOPs is. That is why JAVA is not 100% object oriented.
		 * Boolean :true or false
		 * Numeric: 
		 *      1.Character: char, 
		 *      2.Integral: 
		 *           a.Integer: byte, short, int, long
		 *           b.Floatin-point: float, double
		 *           
		 *           //non-primitive data types:String, class interface, arrays, objects
		 */
		
		//1.byte  size: 1 byte = 8bits range: -128 to 127
		byte b = 10;
		b = 20;
		b = 30;
		byte b1 = -125;
		System.out.println(b);
		System.out.println(b+b1);
		
		//2. short:
		//size: 2 bytes: 16 bits
		//range: -32768 to 32767
		short s1 = 1234;
		short s2 = 1;
		

		//3. int:
		//size: 4 bytes: 32 bits
		//range: -2147483648 to 2147483647
		int i = 10000;
		int j = 1;
		
		//4. long:
			//size: 8 bytes : 64 bits
			//range: 
			long distance = 12121212121L;
			System.out.println(distance);
			
			//5. float:
			//size: 4 bytes = 32 bits
			//range: after . it can take upto 7 digits
			float f1 = 12.33f;
			System.out.println(f1);
			float f2 = 100;
			System.out.println(f2);
			
			//6. double:
			//size: 8 bytes = 64 bits
			//range: after . it can take upto 15 digits
			double d1 = 12.333399999;
			
			//7. char: sing digit value
			//size: 2 bytes = 16 bits
			char c = 'a';
			char c1 = '1';
			char c2 = '$';
			
			System.out.println(c);
			
			//8. boolean:
			//size: ~1 bit
			boolean flag = true;
			boolean h = false;
			
			
		
	}

}
