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
}
