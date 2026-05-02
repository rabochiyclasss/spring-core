package lifeCycle.dev;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("lifeCycle.dev");

        AppLogger appLogger1 = context.getBean(AppLogger.class);
        AppLogger appLogger2 = context.getBean(AppLogger.class);
        System.out.println(appLogger1 == appLogger2);

        OperationContext ctx1 = context.getBean(OperationContext.class);
        OperationContext ctx2 = context.getBean(OperationContext.class);
        OperationContext ctx3 = context.getBean(OperationContext.class);
        System.out.println(ctx1 == ctx2);

        context.close();
    }
}
