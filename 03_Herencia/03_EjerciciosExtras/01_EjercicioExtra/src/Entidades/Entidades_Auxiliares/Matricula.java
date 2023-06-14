package Entidades.Entidades_Auxiliares;

import java.util.Random;

//  Creamos una clase matricula que va a ser una combinacion aleatoria entre letras y numeros
//  Suponemos que una matricula maritima esta constituida por dos letras y tres numeros.
//  Estas letras y numeros los vamos a elegir de manera aleatoria a traves de la eleccion de un
//  indice numerico y tomar el valor de un array con ese indice.

public class Matricula {
 
    //  ATRIBUTOS

        private String[] letrasDisponibles = { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" } ;
        private Integer[] numerosDisponibles = {0,1,2,3,4,5,6,7,8,9};
        private Random aleatorio = new Random();
        private String[] letrasDeMatricula = new String[2];
        private Integer[] numerosDeMatricula = new Integer[3];

    
    //  CONSTRUCTORES

        public Matricula() {

            for (int i = 0; i < letrasDeMatricula.length; i++) {
                
                int indiceAleatorioLetras = aleatorio.nextInt(26);

                letrasDeMatricula[i] = letrasDisponibles[indiceAleatorioLetras];

            }

            for (int i = 0; i < numerosDisponibles.length; i++) {
                
                int indiceAleatorioNumeros = aleatorio.nextInt(10);

                numerosDeMatricula[i] = numerosDisponibles[indiceAleatorioNumeros];

            }

        }

    //  MÉTODOS PERSONALIZADOS
        
        public Matricula creacionMatricula() {
            
            Matricula matricula = new Matricula();

            for (int i = 0; i < letrasDeMatricula.length; i++) {
                
                int indiceAleatorioLetras = aleatorio.nextInt(26);

                letrasDeMatricula[i] = letrasDisponibles[indiceAleatorioLetras];

            }

            for (int i = 0; i < numerosDisponibles.length; i++) {
                
                int indiceAleatorioNumeros = aleatorio.nextInt(10);

                numerosDeMatricula[i] = numerosDisponibles[indiceAleatorioNumeros];

            }

            return matricula;

        }


        
    
}
