package potato.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TodoTest {
    @Test
    public void toStringTest() {
        try {
            Todo t = new Todo("feed cat", false, "NIL");
            assertEquals("[T][ ][NIL] feed cat", t.toString());
        } catch (Exception e) {
            System.out.println("Make sure you input is correct!");
        }
    }
}
