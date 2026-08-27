package zhu.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("main-task")
@Scope("prototype")
public class Task {
    public Task() {
        this.name = "task";
        this.duration = 60L;

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
