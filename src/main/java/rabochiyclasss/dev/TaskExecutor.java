package rabochiyclasss.dev;

import org.springframework.stereotype.Component;
import rabochiyclasss.dev.aop.Loggable;

@Component
public class TaskExecutor {
    private final Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }

    @Loggable
    public void executeTask() {
        System.out.printf("Execute task with name %s, total seconds %s%n",
                task.getName(),
                task.getDuration()
        );
    }
}
