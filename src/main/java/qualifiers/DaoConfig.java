package qualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("qualifiers")
@EnableScheduling
public class DaoConfig {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(DaoConfig.class);
    }
}
