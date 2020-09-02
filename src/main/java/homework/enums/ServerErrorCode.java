package homework.enums;

public class ServerErrorCode implements StatusCode {
    @Override
    public void doLogic(int code) {
        System.out.println("The code is " + code + ".");
        System.out.println("Our developers will fix that.");
    }
}
