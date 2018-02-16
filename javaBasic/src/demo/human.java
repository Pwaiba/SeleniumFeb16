package demo;

public class human {
String color; // variable declared in a class level called as fields 
int age;
String gender;

public human() {   //constructor overloading 
	color = "White";  //Default constructor
	age = 20;
	gender = "Male";
}


public human (String humanColor, int humanAge, String humanGender) {  // parameterized Constructors 
		color = humanColor;
		age = humanAge;
		gender = humanGender;
						
}
public void printDelails() {
	System.out.println("Color = " + color + " Age = " + age + " Gender = " + gender);
}

public static void main(String[]args) {
human John = new human("White",25,"Male");  //parameterized value
human Ram = new human("Brown" ,32, "Male");
human Rose = new human("Browm" ,27, "Female");
human Tim = new human(); //default value 

Tim.printDelails();
Ram.printDelails();
John.printDelails();
Rose.printDelails();

}



}

