package zhu.dev;

import org.springframework.stereotype.Component;
import zhu.dev.aop.Loggable;

@Component
public class TaskExecutor {
    private final Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }
    @Loggable(value = "ERROR", count = 3)
    public void executeTask() {
        System.out.printf("Execute task with name %s, total seconds %s%n", task.getName(), task.getDuration());
    }
}
