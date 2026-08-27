package zhu.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
@Scope("prototype")
public class Task {
    public Task() {
        this.name = "task"+ ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
        System.out.println("call task constructor");
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
