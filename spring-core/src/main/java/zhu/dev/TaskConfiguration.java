package zhu.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfiguration {
    @Bean
    public Task task(){
        return new Task();
    }
    @Bean
    public TaskManager taskManager(Task task){
        return new TaskManager(task);
    }
}
