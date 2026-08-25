package zhu.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("zhu.dev");
        Task task = context.getBean(Task.class);
        System.out.println(task);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();
    }
}
