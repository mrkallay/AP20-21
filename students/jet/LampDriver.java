public class LampDriver {

    public static void main(String[] args) {

        Lamp a = new Lamp();
        System.out.println(a.getStatus());
        a.flipSwitch();
        System.out.println(a.getStatus());
        a.flipSwitch();
        System.out.println(a.getStatus());
    }

}
