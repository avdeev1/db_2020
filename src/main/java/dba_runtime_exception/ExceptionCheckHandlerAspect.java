package dba_runtime_exception;

import lombok.Setter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class ExceptionCheckHandlerAspect {

    @Setter
    private List<String> mails;

    @Autowired
    public void setWords(@Value("${mails}") String[] mails) {
        this.mails = Arrays.asList(mails);
    }

    @AfterThrowing(throwing = "ex", pointcut = "execution(* dba_runtime_exception.ExampleService.*(..))")
    public void sendMails(JoinPoint joinPoint, Exception ex) {
        mails.forEach(mail -> System.out.println("Mail was sent to " + mail));
    }
}
