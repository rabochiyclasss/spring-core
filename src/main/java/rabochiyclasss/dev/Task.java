package rabochiyclasss.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("main-task")
public class Task {

    private final String name;
    private final Integer duration;

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration
    ){
        this.name = name;
        this.duration = duration;
//        System.out.println("call task constructor");
    }

    @PostConstruct
    public void postConstruct() {
//        System.out.println("task post construct");
    }

    @PreDestroy
    public void preDestroy() {
//        System.out.println("task pre destroy");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
