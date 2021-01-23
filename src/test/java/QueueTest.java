import com.lee.java_study.week4.queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QueueTest {

    @Test
    public void testEnqueue(){
        Queue queue = new Queue(5);
        Assertions.assertEquals(-1,queue.getTop());
        Assertions.assertEquals(-1,queue.getTail());
        queue.enqueue(0);
        Assertions.assertEquals(0,queue.getTop());
        Assertions.assertEquals(0,queue.getTail());
        queue.enqueue(1);
        Assertions.assertEquals(0,queue.getTop());
        Assertions.assertEquals(1,queue.getTail());
        queue.enqueue(2);
        Assertions.assertEquals(0,queue.getTop());
        Assertions.assertEquals(2,queue.getTail());
        queue.enqueue(3);
        Assertions.assertEquals(0,queue.getTop());
        Assertions.assertEquals(3,queue.getTail());
        queue.enqueue(4);
        Assertions.assertEquals(0,queue.getTop());
        Assertions.assertEquals(4,queue.getTail());
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        Assertions.assertEquals(10, queue.queueArr.length);
        Assertions.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 0]", Arrays.toString(queue.queueArr));
    }


    @Test
    public void testDequeue(){
        Queue queue = new Queue(5);

        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        Assertions.assertEquals(0, queue.dequeue());
        Assertions.assertEquals(1, queue.dequeue());
        Assertions.assertEquals(2, queue.dequeue());
        Assertions.assertEquals(3, queue.dequeue());
        Assertions.assertEquals(4, queue.dequeue());
        queue.enqueue(0);
        Assertions.assertEquals(0, queue.dequeue());

    }

}
