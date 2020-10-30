public class Dog
{
    private String name;
    private double weight;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setWeight(double weight)
    {

        if(weight > 0)
        {
            this.weight = weight;
        }
        else
        {
            System.out.println("Input the correct weight");
        }
    }
    public void getInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight);

    }
}