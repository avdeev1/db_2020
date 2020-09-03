package homework.never_use_switch;

public class CallbackMailMessage implements MailHandler {
    @Override
    public int sendMessage(MailInfo mailInfo) {
        System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
        return 2;
    }
}
