
class Reptiles {
	int maxAge;
	String commitment;
	String Specie;
	Reptiles(int averageMaxAge,String Species){
		/* 
		 * In this Super Constructor I used "this" to refer to the variables declared in the class.
		 * */
		if(averageMaxAge > 15) {
			this.commitment = "Lifetime";
		}
		if(averageMaxAge < 15) {
			this.commitment = "Medium";
		}
		this.maxAge = averageMaxAge;
		this.Specie = Species;
	}
	
}

class Lizzards extends Reptiles {
	
	Lizzards(int averageMaxAge,String Species){
		// In the is super constructor call I used the "super" key word to call on the super class constructor.
		super(averageMaxAge,Species);
		// In these print statements I used the key word "super" to refer to variables.
		System.out.println(super.maxAge);
		System.out.println(super.Specie);
		System.out.println(super.commitment);
	}
}

class Snakes extends Reptiles {
	Snakes(int averageMaxAge,String Species){
		// In the is super constructor call I used the "super" key word to call on the super class constructor.
		super(averageMaxAge,Species);
		// In these print statements I used the key word "super" to refer to variables.
		System.out.println(super.maxAge);
		System.out.println(super.Specie);
		System.out.println(super.commitment);
	}
}
class Main {
	
	public static void main(String[] args) {
		System.out.println("New Object");
		Lizzards crestedGecko = new Lizzards(12,"Gecko");
		System.out.println("The object is located at " + crestedGecko);
		System.out.println("New Object");
		Snakes ballPython = new Snakes(80,"Python");
		System.out.println("The object is located at " + ballPython);
		System.out.println("New Object");
		Lizzards Iguana = new Lizzards(30,"Iguana");
		System.out.println("The object is located at " + Iguana);
	}
	/*
	 * The "super" and "this" keyword makes working with inheritance in classes and constructors so much easier and cleaner.  
	 * The "this" keyword is to 'eliminate the confusion between class attributes and parameters with the same name
	 *  (because a class attribute is shadowed by a method or constructor parameter)'(Java this Keyword. n.d.).
	 * The "super" keyword is very similar to the "this" keyword but it refers to variables and constructors in the parent class. (Java Super Keyword. 2020)
	 * 
	 * References:
	 * 				Java this Keyword. (n.d.). W3Schools. Retrieved May 9, 2022, from https://www.w3schools.com/java/ref_keyword_this.asp
	 * 				Java Super Keyword Tutorial - Super Keyword for Variables, Constructors and Methods. (2020, April 2). [Video]. YouTube. https://www.youtube.com/watch?v=hLYOpvoM4vk
	 * 				Eck, D. J. (2019). Introduction to programming using Java, version 8.1. Hobart and William Smith Colleges. http://math.hws.edu/javanotes/. 
	 * */
}