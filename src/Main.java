public class Main {
    public static void  main(String[]args){

        int lightId = 1;
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

    }
}