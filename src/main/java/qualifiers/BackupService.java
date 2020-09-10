package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class BackupService {
    @Autowired
    @OracleDao
    private Dao oracle;

    @Autowired
    @DerbyDao
    private Dao derby;

    @Scheduled(fixedDelay = 3000)
    public void doBackup() {
        this.derby.save();
    }

    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        this.oracle.save();
    }
}
