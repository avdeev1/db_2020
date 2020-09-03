package homework.never_use_switch;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {


    public int sendMailInfo(Map<Integer, MailHandler> handlers, MailInfo mailInfo) {
        MailHandler handler = handlers.get(mailInfo.getMailType());
        if (handler != null) {
            return handler.sendMessage(mailInfo);
        }

        return handlers.get(Constants.LENO4KA).sendMessage(mailInfo);
    }
}
