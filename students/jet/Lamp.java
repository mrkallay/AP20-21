public class Lamp {

    private String name;


    public Boolean isOn;




    public void flipSwitch(){

        if(isOn == false)
        {
            isOn = true;


        }
        else {
            isOn = false;
        }
    }
    public String getStatus()
    {
        if (isOn == false){
            return "the lamp is off";
        }
        else
        {
            return "the lamp is on";
        }

    }
}

