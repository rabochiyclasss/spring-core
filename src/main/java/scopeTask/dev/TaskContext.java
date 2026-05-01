package scopeTask.dev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Scope("prototype")
@Component
public class TaskContext {
    private final UUID id;

    public TaskContext () {
        this.id =  UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
