package homework.never_use_switch;


import java.util.HashMap;
import java.util.Map;

public class MailMessagesFactory {
    private static MailMessagesFactory factory;
    private Map<Integer, MailHandler> handlers = new HashMap<>();
    private static boolean isInit = false;

    public MailMessagesFactory() {
        if (!isInit) {
            createMap();
            isInit = true;
        }
    }

    private void createMap() {
        handlers.put(Constants.WELCOME_MAIL, new WelcomeMailMessage());
        handlers.put(Constants.CALLBACK, new CallbackMailMessage());
        handlers.put(Constants.LENO4KA, new Error404());
    }

    public Map<Integer, MailHandler> getHandlers() {
        return this.handlers;
    }
}
