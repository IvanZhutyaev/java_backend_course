package zhu.dev;

import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {
    private final Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }
    public void executeTask() {
        System.out.printf("Execute task with name %s, total seconds %s%n", task.getName(), task.getDuration());
    }
}
