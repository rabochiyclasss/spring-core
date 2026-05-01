package scopeTask.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {

    private final org.springframework.beans.factory.ObjectProvider<TaskContext> taskContextObjectProvider;

    @Autowired
    public JobRunner(org.springframework.beans.factory.ObjectProvider<TaskContext> taskContextObjectProvider) {
        this.taskContextObjectProvider = taskContextObjectProvider;
    }

    public void runOnce() {
        TaskContext taskContext = taskContextObjectProvider.getObject();
        System.out.println(taskContext.getId());
    }
}
