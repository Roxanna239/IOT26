public class Main {
    public static void  main(String[]args){

        int lightId = 101;
        boolean isLightOn = false;
        int brightness = 0;

        String doorZone = "hall" ;
        boolean isOpen = true;


        if(isOpen) {
            isLightOn = true;
            brightness = 80;
            System.out.println("LARM: dörrem är öppen!");
            System.out.println("Lampstatus: " + brightness + " " + lightId + " " + isLightOn);
        } else {
            System.out.println("");
        }
        if(brightness >= 0 && brightness <= 100) {
            System.out.println("Ljusstyrka är giltig: " + brightness);
        }else {
            System.out.println("Fel: ogiltig ljusstyrka!");
        }

        for (int i = 0 ; i <= 100 ; i += 20){
            System.out.println((" Det aktuella dimmer är: " + i ));
        }

        System.out.println("Lampan är " + isLightOn);
        isLightOn = !isLightOn;
        System.out.println("Lampan är " + isLightOn);

        brightness = 150;
        if(brightness >= 0 && brightness <= 100) {
            System.out.println("Ljusstyrka är giltig: " + brightness);
        }else {
            System.out.println("Fel: ogiltig ljusstyrka!");
        }

        brightness = -10;
        if(brightness >= 0 && brightness <= 100) {
            System.out.println("Ljusstyrka är giltig: " + brightness);
        }else {
            System.out.println("Fel: ogiltig ljusstyrka!");
        }
    }

}
