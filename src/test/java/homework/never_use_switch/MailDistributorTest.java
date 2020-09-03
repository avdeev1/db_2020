package homework.never_use_switch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailDistributorTest {

    @Test
    public void sendMailInfo() {
        MailMessagesFactory factory = new MailMessagesFactory();

        // 1
        Assert.assertEquals(
                1,
                new MailDistributor().sendMailInfo(
                        factory.getHandlers(),
                        MailInfo.builder()
                                .email("123")
                                .mailType(1)
                                .text("123")
                                .build()
                )
        );

        // 2
        Assert.assertEquals(
                2,
                new MailDistributor().sendMailInfo(
                        factory.getHandlers(),
                        MailInfo.builder()
                                .email("123")
                                .mailType(2)
                                .text("123")
                                .build()
                )
        );

        // 404
        Assert.assertEquals(
                404,
                new MailDistributor().sendMailInfo(
                        factory.getHandlers(),
                        MailInfo.builder()
                                .email("123")
                                .mailType(404)
                                .text("123")
                                .build()
                )
        );
    }
}