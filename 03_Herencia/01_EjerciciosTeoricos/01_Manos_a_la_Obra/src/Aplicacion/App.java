import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;

public class App {
    
    public static void main(String[] args) throws Exception {

        Animal a = new Animal();

        Animal b = new Perro();

        Animal c = new Gato();


        a.hacerRuido();

        b.hacerRuido();

        c.hacerRuido();

    }
}
