package qualifiers;

import org.springframework.stereotype.Component;

@DerbyDao
@Component
public class Derby implements Dao {
    @Override
    public void save() {
        System.out.println("Derby save");
    }
}
