package week2.day2;

public class Class8 {

	public static void main(String[] args) {
		// Type Casting
		// up-grade (byte -> short -> int -> long or float -> double)
		// down grade (byte <- short <- int <- long or float <- double)
		
		byte bn = 123;
		short sn = bn;
		int in = sn;
		long ln = in;
		float fn = ln;
		double dn = fn;
		System.out.println(dn);
		
		dn = 12345678.987654321;
		fn = (float)dn;   // cannot convert from double to float
		ln = (long)fn;
		in = (int)ln;
		sn = (short) in;
		bn = (byte) sn;
		System.out.println(bn);
		
		
		// type Conversion 
		// String ->Numeric 
		// Numeric ->String
		
		String str1 = "123.456";
		double dn2 = Double.parseDouble(str1);  // String to double
		dn2 += 1;
		System.out.println(dn2);
		
		dn2 = 45678.91233;
		//str1 = dn2;   // Type mismatch: cannot convert from double to String
		str1 = Double.toString(dn2);   // double to String 
		System.out.println(str1);
		
		// Byte.parseByte()
		// Byte.toString()
		
		// short.parseShort()
		// short.toString()
		
		//	Integer.parseInt()
		//	Integer.toString();
	
		//	Long.parseLong()
		//	Long.toString()

		//	Float.parseFloat()
		//	Floa.toString
		
		//Double.parseDouble()
		//Double.toString()
		
		
		
		
		
	}

}
