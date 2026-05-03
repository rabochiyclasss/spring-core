package propertyTask.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("propertyTask.dev")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
