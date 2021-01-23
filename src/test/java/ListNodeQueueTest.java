import com.lee.java_study.week4.queue.ListNodeQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListNodeQueueTest {



    @Test
    public void testCreateQueue(){
        ListNodeQueue queue = new ListNodeQueue();
        queue.enqueue(3);
        Assertions.assertEquals(3, queue.getTop().getData());
        Assertions.assertEquals(3, queue.getTail().getData());
    }

    @Test
    public void testEnqueue(){
        ListNodeQueue queue = new ListNodeQueue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        Assertions.assertEquals(3,queue.getTop().getData());
        Assertions.assertEquals(5,queue.getTail().getData());

    }

    @Test
    public void testTraceQueue(){
        ListNodeQueue queue = new ListNodeQueue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.traceQueue();
        queue.enqueue(6);
        queue.traceQueue();
    }

    @Test
    public void testDequeue(){
        ListNodeQueue queue = new ListNodeQueue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.traceQueue();
        Assertions.assertEquals(3, queue.dequeue());
        queue.traceQueue();
        Assertions.assertEquals(4,queue.dequeue());
        queue.traceQueue();
        Assertions.assertEquals(5,queue.dequeue());
        queue.traceQueue();
    }

}
