public class DoorSensor {

    String sensorId;
    boolean isOpen;

    public DoorSensor(String id) {
        sensorId = id;
        isOpen = false;
    }

    public void openDoor() {
        isOpen = true;
        System.out.println("Dörren " + sensorId + " " + isOpen);
    }
    public void closeDoor() {
        isOpen = false;
        System.out.println("Dörren " + sensorId + " " + isOpen);

    }
}
