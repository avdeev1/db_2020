package homework.never_use_switch;

public class Error404 implements MailHandler {
    @Override
    public int sendMessage(MailInfo mailInfo) {
        System.out.println("Oooops, something was wrong. Leno4ka will fixed that!");
        return 404;
    }
}
