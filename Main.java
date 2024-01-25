package carShowroom;
import java.util.*;
import java.lang.*;

interface utility{
	public void get_details();
	public void set_details();	
}

public class Main {
	
	static void main_menu() {
		System.out.println();
		System.out.println("********** Welcome to showroom management System *********");
		System.out.println();
		System.out.println("******** Enter your choice *******************");
		System.out.println();
		System.out.println("1] Add showrooms \t\t\t 2] Add employees \t\t\t 3] Add cars");
		System.out.println();
		System.out.println("4] Get showrooms \t\t\t 5] Get employees \t\t\t 6] Get cars");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Showroom showroom[] = new Showroom[5];
		Employees employees[] = new Employees[5];
		Cars car[] = new Cars[5];
		int car_counter = 0;
		int showroom_counter = 0;
		int employees_counter = 0;
		int choice = 100;
		while(choice!=0) {
			main_menu();
			choice = sc.nextInt();
			
			while(choice!=9 && choice!=0) {
				switch(choice) {
				case 1:
					showroom[showroom_counter] = new Showroom();
					showroom[showroom_counter].set_details();
					showroom_counter++;
					System.out.println();
					System.out.println("1] Add New Showroom");
					System.out.println("9] Go back to main menu");
					choice = sc.nextInt();
					break;
				case 2:
					employees[employees_counter] = new Employees();
					employees[employees_counter].set_details();
					employees_counter++;
					System.out.println();
					System.out.println("1] Add New Employee");
					System.out.println("9] Go back to main menu");
					choice = sc.nextInt();
					break;
				case 3:
					car[car_counter] = new Cars();
					car[car_counter].set_details();
					car_counter++;
					System.out.println();
					System.out.println("1] Add New Car");
					System.out.println("9] Go back to main menu");
					choice = sc.nextInt();
					break;
				case 4:
					for(int i=0; i<showroom_counter; i++) {
						showroom[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9] Go back to main menu");
					System.out.println("0] Exit");
					choice = sc.nextInt();
					break;
				case 5:
					for(int i=0; i<employees_counter; i++) {
						employees[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9] Go back to main menu");
					System.out.println("0] Exit");
					choice = sc.nextInt();
					break;
				case 6:
					for(int i=0; i<car_counter; i++) {
						car[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9] Go back to main menu");
					System.out.println("0] Exit");
					choice = sc.nextInt();
					break;
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			}
		}
	}

}
