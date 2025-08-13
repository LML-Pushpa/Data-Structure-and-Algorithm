package static_stack_data_structure;

import java.util.Scanner;

public class StackClient {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Stack stk = null; 
	        int choice;
	        int size;

	        while (true) {
	            System.out.println("\n====== Stack Menu ======");
	            System.out.println("1 : Create Stack");
	            System.out.println("2 : Push");
	            System.out.println("3 : Pop");
	            System.out.println("4 : Peek");
	            System.out.println("5 : Display");
	            System.out.println("0 : Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the size of Stack: ");
	                    size = sc.nextInt();
	                    stk = new Stack(size);
	                    System.out.println("Stack created with size " + size);
	                    break;

	                case 2:
	                    if (stk == null) {
	                        System.out.println("Please create a stack first!");
	                    } else {
	                        System.out.print("Enter element to push: ");
	                        int value = sc.nextInt();
	                        stk.push(value);
	                    }
	                    break;

	                case 3:
	                    if (stk == null) {
	                        System.out.println("Please create a stack first!");
	                    } else {
	                        stk.pop();
	                    }
	                    break;

	                case 4:
	                    if (stk == null) {
	                        System.out.println("Please create a stack first!");
	                    } else {
	                        int topElement = stk.peek();
	                        if (topElement != -1) { 
	                            System.out.println("Top element is: " + topElement);
	                        }
	                    }
	                    break;

	                case 5:
	                    if (stk == null) {
	                        System.out.println("Please create a stack first!");
	                    } else {
	                        stk.dispaly();
	                    }
	                    break;

	                case 0:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        }
	}

}
