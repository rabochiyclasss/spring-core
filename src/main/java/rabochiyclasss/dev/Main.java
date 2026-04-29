package rabochiyclasss.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("rabochiyclasss.dev");

//      Task is a singletone bean so task1 == task2 will return true (it refer to the same object)
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);

        System.out.println(task1 == task2);
        TaskManager taskManager =(TaskManager) context.getBean("taskManager");
        taskManager.printTask();
    }
}