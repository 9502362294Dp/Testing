package variables;

public class CallingUsingStaticAndNonStataic {

	public static int a = 10;
	public static int b = 20;
	
	public static void add () {
		System.out.println(a + b);
	}
	public void multi() {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		add();
		CallingUsingStaticAndNonStataic f = new CallingUsingStaticAndNonStataic();
		f.multi();
		System.out.println();
	}
	}
// Static methods can access static methods Directly
//                                          --------
//Non Static methods can access Non Static methods Directly
//												   --------
//Static methods can access Non Static Methods (By Using Reference Variable)
//											   -----------------------------
//Non Static Methods Can access Static Methods Directly
//											   --------




//suppose consider our class is static pool area so we can call our friends who are 
//presented in our class by directly

//suppose our friends present in the another class if we want to call him we use some
//referance to call him
