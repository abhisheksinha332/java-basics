package inheritance;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog obj=new Dog();
		obj.sound();
	}
	
	public void sound(){
		System.out.println("Woof Woof");
	}

}
