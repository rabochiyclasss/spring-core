package rabochiyclasss.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("rabochiyclasss.dev");

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        context.close();
    }
}