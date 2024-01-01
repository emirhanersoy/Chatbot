import java.util.Scanner;


public class User {

	Scanner scan = new Scanner(System.in);
	
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {

        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
	public int getAge() {
		return age;
	}
	public void setAge() {
		while (true) {
            try {
                System.out.print("Enter your age: ");
                String input = scan.nextLine();

                age = Integer.parseInt(input);

                if (age >= 0 && age <= 120) {
                    break;
                } else {
                    System.out.println("Please enter a valid age between 0 and 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer value for age.");
            }
        }
    }

	
	
	
}
