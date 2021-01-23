import com.lee.java_study.week4.stack.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    @DisplayName("arrayStack Test")
    void testCreateStack(){
        Stack stack = new Stack(3);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(3, stack.getStackArr().length);
    }

    @Test
    void testPeek(){
        Stack stack = new Stack(3);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.peek());
    }

    @Test
    void testPop(){
       Stack stack = new Stack(3);
       stack.push(0);
       stack.push(1);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);
       stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
