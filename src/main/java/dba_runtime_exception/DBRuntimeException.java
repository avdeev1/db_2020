package dba_runtime_exception;

import heroes.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class DBRuntimeException {

//    @Retryable(maxAttempts = 5,backoff =@Backoff(500))
    public void doWork(){
        System.out.println("trying...");

        if (RandomUtil.getIntBetween(0, 1) == 0) {
            throw new IllegalStateException("");
        }
        System.out.println("ура!!!!");
    }
}
