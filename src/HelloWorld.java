
public class HelloWorld {
public static void main(String[] args) {
	System.out.println("hello world ");
	System.out.println("this is java");
	printName();
	
}

static void printName(){
	System.err.println("Error ");
	throw new RuntimeException();
}


}
