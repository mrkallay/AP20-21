import java.lang.Math;
public class Lamp {

    private String name;


    private Boolean isOn;
    private int brightness;


    public void flipSwitch() {

        if (isOn == true) {
            isOn = false;

        } else {

            isOn = true;
        }
    }


    public void setBrightness(int brightness) {


        this.brightness = brightness;


    }

    public void random() {


        brightness = 5 + (int) ((5 - 1 + 1) * Math.random());


    }


    public void setBrightnessRandom(){
        if(brightness >= 1 && brightness <= 5){

            this.brightness= brightness;
        }
        else{

            setBrightness(1);
        }

    }

    public String getStatus() {
        String message= "";
        if (isOn == true) {

            message=  "the lamp is on";
        }
        else{

            message=  "the lamp is off";
        }

        message += "\n Brightness" + brightness;
        return message;
    }
}
