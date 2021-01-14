
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
		System.out.println("Beginning");
		
		System.out.println(10/0);
		

		}catch(Throwable t)
		{
			
			System.out.println("Error");
			System.out.println(t.getMessage());
		}
		System.out.println("Ending");
	}

}
