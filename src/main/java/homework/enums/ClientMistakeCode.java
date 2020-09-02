package homework.enums;

public class ClientMistakeCode implements StatusCode {
    @Override
    public void doLogic(int code) {
        System.out.println("Oooops, the code is " + code + ".");
        System.out.println("You broke something!!!");
    }
}
