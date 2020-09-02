package homework.enums;

public class SuccessCode implements StatusCode {
    @Override
    public void doLogic(int code) {
        System.out.println("The code is " + code + ".");
        System.out.println("Good luck!");
    }
}
