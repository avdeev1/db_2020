package homework.enums;

public class InformationalCode implements StatusCode {
    @Override
    public void doLogic(int code) {
        System.out.println("The code " + code + " is informational.");
    }
}
