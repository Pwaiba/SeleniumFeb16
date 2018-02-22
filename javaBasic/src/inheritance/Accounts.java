package inheritance;

public class Accounts extends Management {

int	bonus = 8000;
	public static void main(String[] args) {
		Accounts Sara = new Accounts();
		System.out.println("Sara's bonus and salary = "+ (Sara.bonus + Sara.salary));
		
	}
	
}
