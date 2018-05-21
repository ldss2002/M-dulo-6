package queue;
import java.util.PriorityQueue;
public class Queue {

  public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // Add data.
        queue.add(5);
        queue.add(2);
        queue.add(8);
        queue.add(1);
        queue.add(2);
        queue.add(11);
       
        System.out.println("O elemento à cabeça:" + queue.element());
        while (queue.size() > 0) {
        System.out.println(queue.remove());
            Integer removedElement = queue.poll();
		System.out.println("removedElement : " + removedElement);
		System.out.println("queue : " + queue + "\n");
        
                
  }  }
}

