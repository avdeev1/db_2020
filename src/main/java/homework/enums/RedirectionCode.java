package homework.enums;

public class RedirectionCode implements StatusCode {
    @Override
    public void doLogic(int code) {
        System.out.println("The code " + code + "is about redirection.");
        System.out.println("Dont worry about that. It's ok.");
    }
}
