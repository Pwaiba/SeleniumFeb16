package methodOverloading;

public class Printer {
public void print(String name) {
	System.out.println("you have intered your name as - " + name);
}
public void print(int age) {
	System.out.println("you have entered your age as - " + age);
}
public static void main(String [ ] args) { 
	Printer Brother = new Printer();
	Brother.print("37");
			
}
}
