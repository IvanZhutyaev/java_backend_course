package zhu.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
public class Task {
    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration
    ) {
        this.name = name+ ThreadLocalRandom.current().nextInt();
        this.duration = duration;
//        System.out.println("call task constructor!");
    }

    @PostConstruct
//    public void postConstruct(){
//        System.out.println("task post construct");
//    }
    @PreDestroy
//    public void preDestroy(){
//        System.out.println("task pre destroy");
//    }
    public Integer getDuration() {
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
    private final Integer duration;
}
