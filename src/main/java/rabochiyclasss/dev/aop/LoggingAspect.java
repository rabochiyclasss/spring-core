package rabochiyclasss.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* rabochiyclasss.dev.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before calling method: " +
                joinPoint.getSignature().getName());
    }

    @AfterReturning(
            value = "execution(* rabochiyclasss.dev.TaskManager.*(..))",
            returning = "result"
    )
    public void logAfterReturning(
            JoinPoint joinPoint,
            Object result
    ) {
        System.out.println("After returning result: " +
                joinPoint.getSignature().getName() + ", result is " + result);
    }

    //if we receive an exception this block of code will be executed
    @AfterThrowing(
            value = "execution(* rabochiyclasss.dev.TaskManager.*(..))",
            throwing = "exc"
    )
    public void afterThrowing(
            JoinPoint joinPoint,
            Exception exc
    ){
        System.out.println("After Exception: " + exc.getMessage());
    }

    //this block of code works like finally (executes always)
    @After("execution(* rabochiyclasss.dev.TaskManager.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After method execution: " + joinPoint.getSignature().getName());
    }


}
