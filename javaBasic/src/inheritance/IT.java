package inheritance;

public class IT extends Management {
	
	
int bonus = 10000; 


public void day() { 
	System.out.println("Today is Sunday");   //methods overriding 
	
	}


public static void main(String[] args) {
	IT Ram = new IT();
	System.out.println("Bonus of Ram = $ " + Ram.bonus);
	System.out.println("Salary of Ram = $ " + Ram.salary);
	Ram.day();  // objecet.method 
}

}
