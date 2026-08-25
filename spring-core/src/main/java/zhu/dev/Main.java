package zhu.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);
//        Task task = context.getBean(Task.class);
//        Task task2 = (Task)context.getBean("main-task");
//
//        System.out.println(task);
//        System.out.println(task2);
//        System.out.println(task==task2);

        TaskManager taskManager = context.getBean(TaskManager.class);
        TaskManager taskManager2 = (TaskManager) context.getBean("taskManager");

        taskManager.printTask();
        

    }
}
