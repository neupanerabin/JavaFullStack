package week1;

import java.lang.Boolean;

public class BooleanTest {

	public static void main(String[] args) {
		
		/*
		
		// TODO Auto-generated method stub
		Boolean b1, b2;
		//b1 = new Boolean();   //The constructor Boolean() is undefined
		b1 = new Boolean(true); // The constructor Boolean(boolean) has been deprecated and marked for removal
		
		b2 = new Boolean("true");
		System.out.println(b1);
		System.out.println(b2);
		boolean result = b1.booleanValue();   // non static
		System.out.println(result);
		
		int result2 = Boolean.compare(b1,b2);
		System.out.println(result2);   // 0->equals | None zero ->Not equals
		
	
		
		boolean b3;

		//static boolean	parseBoolean(String s)	
		//String	toString()
		Boolean b11;
		b11 = new Boolean(true);
		String str1 = b1.toString();
		System.out.println(str1);
		
		Boolean b22 = Boolean.parseBoolean("true");
		System.out.println(b22);
"
		*/
		
		// byte 
		byte x = 1;
		byte y = 11;
		
		boolean result = (x==y);   // compare the byte value
		
		System.out.println("Byte value:"+result);
		
		// Compare
		boolean isEqual = (x >= y);
		System.out.println("Compare\t  :"+isEqual);
		
		//Compare to boolean value
		Boolean b1 = true;
		Boolean b2 = false;
		
		int result1 = b1.compareTo(b2);
		System.out.println("compare to :" +result1);
		
		// equals
		Boolean equals = b1.equals(b2);
		System.out.println("equals : "+equals);
		
		// get Boolean
		boolean resulte = Boolean.getBoolean("my_property");

		System.out.println("get boolean:" +resulte);
		
		// hashCode
		Boolean has = true;
		int ha = has.hashCode();
		System.out.println("Hash Code :" +ha);
		
		// hash Code(Boolean object
		Boolean hase=false;
		int hashObject = Boolean.hashCode(hase);
		System.out.println("Hash Object :"+ hashObject);
		
		//logicalAnd
		Boolean logical1 = true;
		Boolean logical2 = false;
		
		Boolean logic = Boolean.logicalAnd(logical1,  logical2);
		System.out.println("Logical and: "+logic);
		boolean logicdd = logical1 && logical2;
		System.out.println("Logical and :"+logicdd);
		
		// logical or 
		boolean or = Boolean.logicalOr(logical1, logical2);
		System.out.println("Logical or :"+or);
		
		// logical xor
		boolean xor = Boolean.logicalXor(logical1, logical2);
		System.out.println("Logical xor ;"+xor);
		
		//parseBoolean 
		Boolean parse = Boolean.parseBoolean("false");   // return true if there is only true
		System.out.println("parse Boolean : "+parse);
		
		//toString 
		Boolean str = true;
		
		String strw = str.toString();
		System.out.println(strw);
		

		// to parseString 
		Boolean parses = Boolean.parseBoolean("true");
		System.out.println("Parse Boolean: "+parse);
		
		// parse Boolean(String s)
		Boolean pa = Boolean.parseBoolean("true");
		System.out.println(pa);
		
		//valueOf(Boolean b)
		Boolean val = true;
		Boolean value = Boolean.valueOf(val);
		System.out.println("Value of String: "+value);
		
		//valueOf(String of)
		String values= "Hello";
		Boolean valuestring = Boolean.valueOf(values);
		System.out.println("Valueof String :"+valuestring);
		
		
			
		
		
		
		

	}

}
