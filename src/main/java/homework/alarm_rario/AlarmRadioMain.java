package homework.alarm_rario;

public class AlarmRadioMain {
    public static void main(String[] args) {
        AlarmRadioBestProduct alarmRadioBestProduct = new AlarmRadioBestProduct();

        alarmRadioBestProduct.turnOn();
        alarmRadioBestProduct.listen();
        alarmRadioBestProduct.setWakeUpTime(12); // 12 утра
    }
}
