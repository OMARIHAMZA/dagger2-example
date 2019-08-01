package omari.hamza;


public class Main {

    public static void main(String[] args) {
        Doctor doctor = omari.hamza.DaggerDoctor.create();

        Body body = doctor.injectBlood();

        System.out.println(body.getBlood().getKindOfBlood());
    }
}
