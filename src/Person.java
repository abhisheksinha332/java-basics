
class Person {  } 
class Student extends Person { } 
  
class Test 
{ 
    public static void main(String[] args) 
    { 
        Person p = new Person(); 
        if (p instanceof Student) 
           System.out.println("p is instance of Student"); 
        else if (p instanceof Person)
           System.out.println("p is instance of Person");
        else
        	System.out.println("P is not an instance");
    } 
} 