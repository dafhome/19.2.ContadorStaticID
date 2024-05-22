import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppContador {
    public static void main(String[] args) throws Exception {

        ArrayList<Clientes> club = new ArrayList<>();

        club.add(new Clientes("David", "david@prueba.com", 30));
        club.add(new Clientes("Juana", "juana@prueba.com", 23));
        club.add(new Clientes("Pedro", "pedro@prueba.com", 28));
        club.add(new Clientes("Laura", "laura@prueba.com", 39));


        System.out.println();
        for (Clientes clientes : club) {
            System.out.println(clientes);
        }

        
        System.out.println(Clientes.getId());

        club.remove(club.size()-1);
        club.add(new Clientes("Laura2", "laura2@prueba.com", 39));
        club.add(new Clientes("Juan", "juan@prueba.com", 22));


        System.out.println();
        for (Clientes clientes : club) {
            System.out.println(clientes);
        }

        System.out.println(Clientes.getId());

    }
}
