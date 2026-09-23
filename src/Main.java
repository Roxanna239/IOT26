public class Main {
    public static void  main(String[]args) {
        SmartLight lampa1 = new SmartLight("L1");
        lampa1.turnOn();
        lampa1.turnOff();

        SmartLight lampa2 = new SmartLight("L2");
        lampa2.turnOn();
        lampa2.turnOff();

        DoorSensor dörr1 = new DoorSensor("D1");
        dörr1.openDoor();
        dörr1.closeDoor();

        DoorSensor dörr2 =new DoorSensor("D2");
        dörr2.openDoor();
        dörr2.closeDoor();

        dörr1.openDoor();
        if(dörr1.isOpen) {
            lampa1.turnOn();
        }
    }
}

