package rabochiyclasss.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("taskManager post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("taskManager pre destroy");
    }

    public void printTask() {
        if (task == null) {
            System.out.println("No current task");
        }
        else {
            System.out.println("Current task: " + task.toString());
        }
    }

}
