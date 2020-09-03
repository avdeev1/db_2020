package homework.never_use_switch;

public class WelcomeMailMessage implements MailHandler {
    @Override
    public int sendMessage(MailInfo mailInfo) {
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
        return 1;
    }
}
