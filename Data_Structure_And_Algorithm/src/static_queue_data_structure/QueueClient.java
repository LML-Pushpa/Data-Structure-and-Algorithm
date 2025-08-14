package static_queue_data_structure;

import java.util.Scanner;

public class QueueClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Queue queue = null;
        int choice;

        while (true) {
            System.out.println("\n====== Queue Menu ======");
            System.out.println("1 : Create Queue");
            System.out.println("2 : Enqueue");
            System.out.println("3 : Dequeue");
            System.out.println("4 : Display");
            System.out.println("0 : Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter size of Queue: ");
                    int size = sc.nextInt();
                    queue = new Queue(size);
                    System.out.println("Queue created with size " + size);
                    break;

                case 2:
                    if (queue == null) {
                        System.out.println("Please create a queue first!");
                    } else {
                        System.out.print("Enter element to enqueue: ");
                        int value = sc.nextInt();
                        queue.Enqueue(value);
                    }
                    break;

                case 3:
                    if (queue == null) {
                        System.out.println("Please create a queue first!");
                    } else {
                        queue.Dequeue();
                    }
                    break;

                case 4:
                    if (queue == null) {
                        System.out.println("Please create a queue first!");
                    } else {
                        queue.display();
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
	}

}
