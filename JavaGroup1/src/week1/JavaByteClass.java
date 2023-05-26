package week1;

public class JavaByteClass {
	
	public static void main(String[] args) {
		
		// byte value
		byte a = 19;
		Byte b = new Byte(a);    // paramater as constructor call
		byte output = b.byteValue();
		System.out.println("Byte Value of"+ a+"is :"+output);
		
		// Compare of byte value
		byte b1 = 11;
		byte b2 = 11;
		int out = Byte.compare(b1, b2);
		System.out.println("Compare : "+out);
		
		//compareTo(Byte another value)
		String b11 = "11";
		String b22 = "21";
		System.out.println("Compare to :"+b11.compareTo(b22));
		
		// Decodes String into Byte
		System.out.println("Decodes to : "+Integer.decode("43"));
		
		// doubleValue
		byte num1 = 11;
		Byte bytevalue = new Byte(num1);
		double result = bytevalue.doubleValue();
		System.out.println("double value is :"+result);
		
		
		// equals(Object obj)
		byte nums = 12;
		byte nums2 = 123;
		Byte byteValue = new Byte(nums);
		Byte byteValues = new Byte(nums2);
		System.out.println(byteValue.equals(byteValues));
		
		Byte aa = 11;
		Byte num22 = 12;
		System.out.println("Equals :"+aa.equals(num22));
		
		// floatValue
		Byte floatvalue = 11;
		System.out.println("Float Value :"+floatvalue.floatValue());
		
		// hashCode
		System.out.println("HashCode: "+floatvalue.hashCode());
		
		//hash code Byte Value
		System.out.println("HashCode: "+Byte.hashCode(bytevalue));
		
		// int value
		Byte intvalue = 11;
		System.out.println("int value:"+intvalue.intValue());
		
		// longValue
		System.out.println("Long value :"+ intvalue.longValue());
		
		// parseByte(String s)
		String str1 = "11";
		Byte outputs = null;
		System.out.println("Parse Byte: "+outputs.parseByte(str1));
		
		byte value= Byte.parseByte("12");
		System.out.println(value);
		
		//parseByte(String s, int radix)
		String parsevalue = "1A";
		byte results  = Byte.parseByte(parsevalue, 22);
		
		System.out.print(parsevalue +" hex is equal to "+results);

		
		
	}

	

	
}
