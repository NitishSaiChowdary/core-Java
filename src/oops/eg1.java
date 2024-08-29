
		//OOPS : Object Oriented PL
		//Concepts: Class, Object, Inheritance, Poly, Abstraction, Encapsulation
		
		//Other Concepts relevant to OOPS:
		//Interface, enums, modifiers, final keyword, this keyword, super keyword, this(), super()
		
		//Pending
		//final keyword, Encapsulation, this keyword, super keyword, this(), super()
		
		//1.What is Inheritance
		//Inheritance is acquiring the properties from one class to another class
		
		//Types of Inheritance
		//1.Single Level
		//2.Multi-Level
		//3.Multiple (Not Supported)
		//4.Hybrid
		//5:Hierarchical
		
		//2.Difference b/w IS A relation ship and HAS A relation ship
		//IS A Relationship is nothing but Interface
		//HAS A relation ship is nothing but creating the data members (If we don`t want Inheritance we can use has a relationship)
		
		//What is polymorphism
		//polymorphism means having many forms
		
		//1.What are types of polymorphism
		//Compile Time polymorphism and RunTime polymorphism
		
		//2.Difference b/w method overloading and method overriding
		//In Method Overloading we can have only one class and multiple methods with same name and arguments must be different
		//In Method Overriding  we can two classes and method name must be same and arguments must be same
		
		//3.What is operator overloading
		//We use + operator for operator overloading
		//Note + can be used for addition and + can be used for concatenation
		
		//4.What is Constructor Overloading
		//In Constructor Overloading class name and Constructor name must be same and we have can different arguments, one class is enough to perform constructor overloading
		
		//5.What is Constructor  Overriding
		
		//6.What is Static/Early Binding and Dynamic/Late Binding
		
		//1.What is Abstraction
		//Abstraction is the process of hiding the data and highlighting the set of services
		
		//2.What is abstract keyword/modifier
		//By using abstract keyword we can make normal class to abstract class
		
		//1.What is Encapsulation
		//Encapsulation is the process of wrapping the data and their methods into a single unit
		
		
		//this:
		//this keyword to refer current class instance v
		//this keyword to invoke current class method
		//this() constructor to invoke current class constructor
		
		//super:
		//super keyword can be used to refer parent class v
		//super keyword can be used to invoke parent class method
		//super() can be used to invoke parent class conspackage oops;
class A{
	void m1() {
		System.out.println("m1 method");
	}
	
}
class B extends A{
	void m2() {
		System.out.println("m2 method");
	}
	
}
//single level inheritance 
public class eg1 {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		
		
	}

}
