package zhu.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("main-task")
public class Task {
    private TaskManager taskManager;
    public Task() {
        this.name = "task";
        this.duration = 60L;
        this.taskManager = taskManager;
    }
    @Autowired
    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public Long getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }

    private final String name;
    private final Long duration;
}
