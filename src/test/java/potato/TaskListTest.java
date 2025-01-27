package potato;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import potato.task.Task;
import potato.task.Todo;

public class TaskListTest {

    @Test
    public void testTaskListFind() {
        try {
            Task homework = new Todo("do homework", false, "NIL");
            ArrayList<Task> tasks = new ArrayList<>();
            tasks.add(homework);
            TaskList t = new TaskList(tasks);
            String keyword = "find work";
            System.out.println(t.find(keyword));
            assertEquals("1.[T][ ][NIL] do homework\n" + "Ok that's all I found...", t.find(keyword));
        } catch (Exception e) {
            System.out.println("unable to find");
        }
    }
}
