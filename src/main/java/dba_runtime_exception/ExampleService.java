package dba_runtime_exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    private DBRuntimeException dbRuntimeException;

    public void work() {
        dbRuntimeException.doWork();
    }
}
