package zhu.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Executable;

@Component
@Aspect
public class LoggingAspect {
//    @Before("execution(* zhu.dev.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода:"+joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* zhu.dev.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("Псоле возвращение рещзультата:"+joinPoint.getSignature().getName()+" результат = "+result);
//    }
//    @AfterThrowing(value = "execution(* zhu.dev.TaskManager.*(..))", throwing = "exc")
//    public void afterThrowing(JoinPoint joinPoint, Exception exc) {
//        System.out.println("После исключения!@!!: "+ exc.getMessage());
//    }
//
//    @After("execution(* zhu.dev.TaskManager.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("После выполнение метода: "+joinPoint.getSignature().getName());
//    }

//    @Around("execution(* zhu.dev.TaskManager.*(..))")
//    public Object LogAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Before method");
//        Integer result = (Integer)joinPoint.proceed();
//        System.out.println("After method");
//        return result/2;
//    }
        @Before("@annotation(loggable)")
        public void log(JoinPoint joinPoint, Loggable loggable) {
            System.out.printf("LOG %s:BEFORE METHOD=%s\n",loggable.value(),joinPoint.getSignature().getName());
        }

}
