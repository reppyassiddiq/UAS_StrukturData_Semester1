package academy.learnprogramming.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private academy.learnprogramming.queues.Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new academy.learnprogramming.queues.Employee[capacity];
    }

    public void add(academy.learnprogramming.queues.Employee employee) {
        if (back == queue.length) {
            academy.learnprogramming.queues.Employee[] newArray = new academy.learnprogramming.queues.Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public academy.learnprogramming.queues.Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        academy.learnprogramming.queues.Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public academy.learnprogramming.queues.Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
