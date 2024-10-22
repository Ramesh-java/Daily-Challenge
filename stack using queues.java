import java.util.LinkedList;
import java.util.Queue;

class MyStack {
  
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        // Push element to queue2 first
        queue2.offer(x);

        // Transfer all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation: Remove the top element from the stack
    public int pop() {
        return queue1.poll();
    }

    // Top operation: Get the top element of the stack
    public int top() {
        return queue1.peek();
    }

    // Empty operation: Check if the stack is empty
    public boolean empty() {
        return queue1.isEmpty();
    }
}
