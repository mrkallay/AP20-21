public class OvenDriver {

    public static void main(String[] args) {

    Oven ovenOne = new Oven();
    System.out.println(ovenOne.getStatus());
    ovenOne.setBakeTime(20);
    ovenOne.setCurrentTemp(355);
    ovenOne.setDesiredTemp(450);
    ovenOne.getStatus();

    }

}
