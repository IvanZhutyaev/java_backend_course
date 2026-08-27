package zhu.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("zhu.dev");
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println("task1==task2: "+(task1==task2));
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();


    }
}
