package static_queue_data_structure;

public class Queue {
    public int[] queue;
    public int front;
    public int rear;
    public int size;

    // Create a Queue structure
    public Queue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        queue = new int[size];
    }

    // Operation : Enqueue
    public void Enqueue(int data) {
        if (!isFull()) {
            if (front == -1) { // first element
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println("Enqueued: " + data);
        } else {
            System.out.println("Queue overflow...........!!!!!!!!");
        }
    }

    // Operation : Dequeue
    public void Dequeue() {
        if (!isEmpty()) {
            int temp = queue[front];
            System.out.println("Dequeued: " + temp);
            front++;
            if (front > rear) { // reset when queue becomes empty
                front = -1;
                rear = -1;
            }
        } else {
            System.out.println("Queue underflow.............!!!!!!!");
        }
    }

    // Check Queue is Full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Check Queue is Empty
    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    // Display
    public void display() {
        if (!isEmpty()) {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print("|" + queue[i] + "|");
            }
            System.out.println();
        } else {
            System.out.println("Queue is Empty......!!!!!!!!!!!!!");
        }
    }
}
