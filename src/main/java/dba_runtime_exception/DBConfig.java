package dba_runtime_exception;

import org.springframework.context.annotation.*;
import org.springframework.retry.annotation.EnableRetry;

@ComponentScan("dba_runtime_exception")
@Configuration
@EnableRetry
@PropertySource("classpath:dba_mails.properties")
@EnableAspectJAutoProxy
public class DBConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
        ExampleService bean = annotationConfigApplicationContext.getBean(ExampleService.class);
        bean.work();
    }
}
