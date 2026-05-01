package scopeTask.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("scopeTask.dev");

        TaskContext taskContext = context.getBean(TaskContext.class);
        JobRunner jobRunner = context.getBean(JobRunner.class);

        jobRunner.runOnce();
        jobRunner.runOnce();
        jobRunner.runOnce();
    }
}
