package zhu.dev;

import org.springframework.stereotype.Component;

@Component
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
