public class SmartLight {
    String deviceId;
    boolean isOn;
    int brightness;

    public SmartLight(String id) {
        deviceId = id;
        isOn = false;
        brightness = 0;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lampa nr " + deviceId + " är " + isOn);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lampa nr " + deviceId + " är "  + isOn);
    }
    public static void main(String[] args) {
        SmartLight lampa1 = new SmartLight("L1");
        lampa1.turnOn();
        lampa1.turnOff();

        SmartLight lampa2 = new SmartLight("L2");
        lampa2.turnOn();
        lampa2.turnOff();
    }
}
