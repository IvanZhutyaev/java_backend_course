package zhu.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskManager {
    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void init(){
        System.out.println("TaskManager init!!!");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("TaskManager destroy!!!");
    }
    public void printTask(){
        if(task==null){
            System.out.println("Not found task");
        }
        else{
            System.out.println("Current task: "+task.toString());

        }
    }
}
