import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Camion> parking = new ArrayList<>();

        parking.add(new Camion("MAN", 2023, 230000));
        parking.add(new Camion("IVECO", 2000, 65000));
        parking.add(new Camion("SCANIA", 2024, 385000));
        Camion.acelerando();
        
        for (Camion camion : parking) {
            System.out.println(camion);
        }


    }
}
