package scopeTask.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {

    private final TaskContext taskContext;

    @Autowired
    public JobRunner(TaskContext taskContext) {
        this.taskContext = taskContext;
    }

    public void runOnce() {
        System.out.println(taskContext.getId());
    }
}
