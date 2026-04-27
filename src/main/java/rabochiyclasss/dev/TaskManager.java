package rabochiyclasss.dev;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class TaskManager {

    @Autowired
    private Task task;

//    @Autowired
//    public TaskManager(Task task) {
//        this.task = task;
//    }


    public TaskManager() {
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }
}
