package rabochiyclasss.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);
//        Task task = context.getBean(Task.class);
//        Task task2 = (Task) context.getBean("task");
//        System.out.println(task);
//        System.out.println(task2);
//        System.out.println(task == task2);
        TaskManager taskManager =(TaskManager) context.getBean("taskManager");
        taskManager.printTask();
    }
}