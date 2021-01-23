import com.lee.java_study.week4.stack.ListNodeStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListNodeStackTest {

    @Test
    void testCreateStack(){
        ListNodeStack nStack = new ListNodeStack();
        nStack.push(3);
        nStack.push(4);
        Assertions.assertEquals(4, nStack.getTopNode());
        //Assertions.assertEquals(4, nStack.getTopNode().getData()); 이거 작동안함

    }


    @Test
    void testPopStack(){
        ListNodeStack nstack = new ListNodeStack();
        nstack.push(3);
        nstack.push(4);
        Assertions.assertEquals(4, nstack.pop()); // data 4 pop
        Assertions.assertEquals(3, nstack.pop()); // data 3 pop
        Assertions.assertEquals(-1, nstack.pop()); // There is no more data to pop!
        nstack.push(1);
        Assertions.assertEquals(1, nstack.pop());

    }
}
