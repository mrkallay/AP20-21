public class Oven {

    private int desiredTemp;
    private int currentTemp;
    private double bakeTime;


    public void setDesiredTemp(int desiredTemp)
    {
        this.desiredTemp = desiredTemp;
    }
    public void setCurrentTemp(int currentTemp)
    {
       this.currentTemp = currentTemp;
    }
    public void setBakeTime(double bakeTime)
    {
        this.bakeTime =bakeTime;

    }
    public String getStatus()
    {
        if(currentTemp < desiredTemp)
        {
            return ("Oven is preheating");
        }
        else
        {
            return ("Oven is baking");
        }

    }


}
