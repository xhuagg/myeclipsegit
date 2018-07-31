package xhua;


public class TestReflection {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("D://Adder.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
