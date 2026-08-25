package zhu.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {
    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    private final Task task;
    public void printTask(){
        System.out.println("Current task: "+task.toString());
    }
}
