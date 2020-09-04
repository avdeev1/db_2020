package homework.alarm_rario;

public class AlarmRadioBestProduct implements Alarm, Radio {
    private int wakeUpTime;
    private int wave;
    private boolean isRadioTurnOn = false;
    private boolean isAlarmTurnOn = false;

    @Override
    public void setWakeUpTime(int time) {
        this.isAlarmTurnOn = true;
        this.wakeUpTime = time;
    }

    @Override
    public void wakeUp() {
        if (this.isAlarmTurnOn) {
            System.out.println("Waaaaaaaaaaaake uuuuuuuup!!! And now i see what i never saw before.");
        }
    }

    @Override
    public void setWave(int wave) {
        this.wave = wave;
    }

    @Override
    public void listen() {
        if (!this.isRadioTurnOn) {
            System.out.println("Включи радио, дурачок");
            return;
        }
        System.out.println("Город под подошвой! Город под подошвой");
        System.out.println("Город под подошвой! Город под подошвой");
        System.out.println("Город под подошвой! Город под подошвой");
    }

    @Override
    public void turnOn() {
        this.isRadioTurnOn = true;
    }

    @Override
    public void turnOff() {
        this.isRadioTurnOn = false;
    }
}
