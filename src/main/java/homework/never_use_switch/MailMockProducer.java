package homework.never_use_switch;

import com.github.javafaker.Faker;
import heroes.RandomUtil;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */
public class MailMockProducer {

    private MailDistributor mailDistributor = new MailDistributor();
    private Faker faker = new Faker();
    private DataFactory dataFactory = new DataFactory();
    private MailMessagesFactory factory = new MailMessagesFactory();


    @SneakyThrows
    public void sendMailsForever()  {
        while (true) {
            int mailType = RandomUtil.getIntBetween(0, 3) + 1;
            MailInfo mailInfo = MailInfo.builder()
                    .email(dataFactory.getEmailAddress())
                    .mailType(mailType)
                    .text(faker.chuckNorris().fact()).build();
            mailDistributor.sendMailInfo(factory.getHandlers(), mailInfo);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        new MailMockProducer().sendMailsForever();
    }
}






